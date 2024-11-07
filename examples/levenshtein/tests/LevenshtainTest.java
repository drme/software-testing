import org.junit.Assert;
import org.junit.Test;

public class LevenshtainTest
{
	@Test
	public void testSameWords()
	{
		Levenshtein obj = new Levenshtein();
		
		float result = obj.distance("Hello", "Hello");
		
		Assert.assertEquals(0, result, 0.00000000001);
		
		obj = null;
	}

	@Test
	public void testEmpty()
	{
		Levenshtein obj = new Levenshtein();
		
		float result = obj.distance("", "");
		
		Assert.assertEquals(0, result, 0.00000000001);
		
		obj = null;
	}

	@Test
	public void test1Empty()
	{
		Levenshtein obj = new Levenshtein();
		
		float result = obj.distance("A", "");
		
		Assert.assertEquals(1, result, 0.00000000001);
		
		obj = null;
	}

	@Test
	public void testSimillar()
	{
		Levenshtein obj = new Levenshtein();
		
		float result = obj.distance("Helo", "Hello");
		
		Assert.assertEquals(0.2, result, 0.0000001);
		
		obj = null;
	}

	@Test
	public void testSimillarFirstLarger()
	{
		Levenshtein obj = new Levenshtein();
		
		float result = obj.distance("Hello", "Helo");
		
		Assert.assertEquals(0.2, result, 0.0000001);
		
		obj = null;
	}

//	@Test
//	public void testNull()
//	{
//		Levenshtein obj = new Levenshtein();
//		
//		float result = obj.distance(null, "Hello");
//		
//		Assert.assertEquals(1, result, 0.0000001);
//		
//		obj = null;
//	}
}
