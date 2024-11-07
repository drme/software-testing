package sorters;

import org.junit.Assert;
import org.junit.Test;

public class CalcTests
{
	@Test
	public void test2Plus2()
	{
		Calc c = new Calc();
		
		c.clear();
		
		c.add(2);
		c.add(2);
		
		int result = c.getResult();
		
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void test2Mul2()
	{
		Calc c = new Calc();
		
		c.clear();
		
		c.add(2);
		c.add(2);
		
		int result = c.getResult();
		
		Assert.assertEquals(4, result);
	}	
	
	@Test
	public void test2Mul5()
	{
		Calc c = new Calc();
		
		c.clear();
		
		c.add(2);
		c.mul(5);
		
		int result = c.getResult();
		
		Assert.assertEquals(10, result);
	}	
}
