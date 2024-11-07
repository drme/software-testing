package sorters;

import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BubleSorterTests
{
	@ParameterizedTest
	@MethodSource("provideSortSource")
	public void testSort(int[] arrayToSort, int[] expectedArray)
	{
		int[] result = new BubleSorter().sort(arrayToSort, arrayToSort.length);
		
		Assert.assertArrayEquals(expectedArray, result);
	}
	
	private static Stream<Arguments> provideSortSource()
	{
		return Stream.of(
				Arguments.of(new int[] {}, new int[] {}),
				Arguments.of(new int[] {666 }, new int[] { 666 }),
				Arguments.of(new int[] { 3, 2, 1 }, new int[] { 1, 2, 3 }),
				Arguments.of(new int[] { 0xbadf00d, 0xf00 }, new int[] { 0xf00, 0xbadf00d }),
				Arguments.of(new int[] { 4,7,4,7,4,7,267,67234 }, new int[] { 4,4,4,7,7,7, 267, 67234 })
			);
	}
	
}
