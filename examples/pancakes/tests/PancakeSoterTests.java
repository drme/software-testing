import org.junit.Assert;
import org.junit.Test;

public class PancakeSoterTests
{
	@SuppressWarnings("deprecation")
	@Test
	public void testSortEmptyList()
	{
		PancakeSorter sorter = new PancakeSorter();
		
		Integer[] result = sorter.sort(new Integer[] {});
		
		Integer[] expected = new Integer[] { };
		
		Assert.assertEquals("empty list not good", expected, result);
	}

	@Test
	public void testSort12345()
	{
		PancakeSorter sorter = new PancakeSorter();
		
		Integer[] result = sorter.sort(new Integer[] {1,2,3,4,5});
		
		Integer[] expected = new Integer[] { 1,2,3,4,5 };
		
		Assert.assertEquals("empty list not good", expected, result);
	}

	@Test
	public void testSort1534564()
	{
		PancakeSorter sorter = new PancakeSorter();
		
		Integer[] result = sorter.sort(new Integer[] {1,5,3,4,5,6,4});
		
		Integer[] expected = new Integer[] {1,3,4,4,5,5,6 };
		
		Assert.assertEquals("empty list not good", expected, result);
	}
	
	@Test(expected = NullPointerException.class)
	public void testSortNull()
	{
		PancakeSorter sorter = new PancakeSorter();
		
		sorter.sort(null);
	}	
	
	
	@Test(timeout=1)
	public void testSortSpeed()
	{
		PancakeSorter sorter = new PancakeSorter();
		
		Integer[] result = sorter.sort(new Integer[] {1,5,3,4,5,6,4});
		
		Integer[] expected = new Integer[] {1,3,4,4,5,5,6 };
		
		Assert.assertEquals("empty list not good", expected, result);
	}
}
