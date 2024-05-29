package eu.example.crp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;
import java.util.regex.Pattern;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.documents4j.api.DocumentType;
import com.documents4j.job.LocalConverter;

/**
 * Renames  reviewer, supervisor feedback, and Turninit report files to match strict file naming requirements for submission.
 * Converts documents to pdf files.
 */
public class App
{
	public static void main(String[] args) throws IOException
	{
		setUpLogger();
		
//		process("E:/Projects/eclipse/prj346/rec/2024/e/", "_ats.pdf");
//		process("E:/Projects/eclipse/prj346/rec/2024/d/", "_recenzija.pdf");
		
		processTirtutit("d:/Downloads/", "d:/");
	}

	/**
	 * Renames copies Turninit report files with random names from sourceFolder to destination folder by renaming them to match strict file naming requirements.
	 * Checks if similarity index is less than 10, ignores the rest.
	 */
	private static void processTirtutit(String sourceFolder, String resultsFolder) throws IOException
	{
		var thisYear = DateTimeFormatter.ofPattern("yyyy").withZone(ZoneId.systemDefault()).format(Instant.now());

		try (var stream = Files.list(Paths.get(sourceFolder)))
		{
			var files = stream.filter(file -> !Files.isDirectory(file)).filter(p -> p.getFileName().toString().endsWith(".pdf")).toList();

			for (var file : files)
			{
				try (var document = Loader.loadPDF(file.toFile()))
				{
					var stripper = new PDFTextStripper();
					var text = stripper.getText(document);

					text = text.replace('\n', ' ');
					text = text.replace('\r', ' ');

					var similarityIndex = extractText(text, ".*SIMILARITY INDEX[ ]+(\\d+)%.*");
					var author = extractText(text, ".*by (.+)  Submission date:.*");

					if (null != author && similarityIndex != null)
					{
						var nameParts = author.split(" ");
						var index = Integer.parseInt(similarityIndex);

						if (nameParts.length == 2)
						{
							var fileName = String.format("%s_%s_%s_sutapties ataskaita.pdf", nameParts[0], nameParts[1], thisYear);

							if (index < 11)
							{
								logger.info("{}% - {}", similarityIndex, fileName);

								Files.copy(file, Paths.get(resultsFolder + "/" + fileName), StandardCopyOption.REPLACE_EXISTING);
							}
							else
							{
								logger.error("{}% - {} - similarity index is too high", similarityIndex, fileName);
							}
						}
					}
				}
				catch (IOException ex)
				{
					logger.error(ex.getMessage(), ex);
				}
			}
		}
	}

	private static String extractText(String text, String regex)
	{
		var pattern = Pattern.compile(regex);
		var mather = pattern.matcher(text);

		if (mather.find())
		{
			return mather.group(1).trim();
		}

		return null;
	}
	
	/**
	 * Extracts student name from document and renames it nicely. Saves word document to pdf.
	 */
	private static void process(String folder, String suffix) throws IOException
	{
		try (var stream = Files.list(Paths.get(folder)))
		{
			var files = stream.filter(file -> !Files.isDirectory(file)).filter(p -> p.getFileName().toString().endsWith(".docx")).toList();

			for (var file : files)
			{
				try
				{
					var name = getName(file.toFile());

					if (name.length() > 10)
					{
						saveToPdf(file.toFile(), name, suffix);
					}
				}
				catch (FileNotFoundException ex)
				{
					ex.printStackTrace();
				}
			}
		}		
	}
	
	private static void saveToPdf(File file, String name, String suffix)
	{
		try (var docxInputStream = new FileInputStream(file))
		{
			try (var outputStream = new FileOutputStream(new File("d:/" + name + suffix)))
			{
				var converter = LocalConverter.builder().build();

				converter.convert(docxInputStream).as(DocumentType.DOCX).to(outputStream).as(DocumentType.PDF).execute();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static String getName(File file) throws IOException
	{
		try (var extractor = new XWPFWordExtractor(new XWPFDocument(new FileInputStream(file))))
		{
			var text = extractor.getText();
			var pattern = Pattern.compile(".*Bakalaurant.*:(.*)");
			var mather = pattern.matcher(text);

			if (mather.find())
			{
				var name = mather.group(1).trim();

				var parts = name.split(" ");

				if (parts.length == 2)
				{
					return parts[1] + "_" + parts[0];
				}
			}
		}

		throw new FileNotFoundException();
	}
	
	private static void setUpLogger()
	{
		var consoleHandler = new ConsoleHandler();

		var formatter = new SimpleFormatter()
		{
		    private String format = "[%1$tF %1$tT.%1$tL] [%2$-7s] %3$s %n";

		    @Override
		    public synchronized String format(LogRecord logRecord)
		    {
		        return String.format(format, new Date(logRecord.getMillis()), logRecord.getLevel().getLocalizedName(), logRecord.getMessage());
		    }
		};

		consoleHandler.setFormatter(formatter);

		var javaLogger = java.util.logging.Logger.getLogger("");
		
		for (var defaultHandler : javaLogger.getHandlers())
		{
			javaLogger.removeHandler(defaultHandler);
		}
		
		javaLogger.addHandler(consoleHandler);
	}
	
	private static Logger logger = LoggerFactory.getLogger(App.class);
}
