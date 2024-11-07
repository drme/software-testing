package com.example;

import org.junit.Assert;
import org.junit.Test;

public class MathTests
{
	private final static double E = 0.0000001;
	
	@Test
	public void testSin0()
	{
		Math m = new Math();
		
		double result = m.sin(0);
		
		Assert.assertEquals(0, result, E);
	}
	
	@Test
	public void testSin180()
	{
		Math m = new Math();
		
		double result = m.sin(180);
		
		Assert.assertEquals(0, result, E);
	}
	
	@Test
	public void testSin90()
	{
		Math m = new Math();
		
		double result = m.sin(90);
		
		Assert.assertEquals(1, result, E);
	}
	
	@Test
	public void testSin45()
	{
		Math m = new Math();
		
		double result = m.sin(45);
		
		Assert.assertEquals(0.70710678118654752440084436210485, result, E);
	}	
	
	
	@Test
	public void testFact1()
	{
		Math m = new Math();
		
		long result = m.fact(1);
		
		Assert.assertEquals(1, result);
	}	
	
	@Test
	public void testFact2()
	{
		Math m = new Math();
		
		long result = m.fact(2);
		
		Assert.assertEquals(2, result);
	}	
	
	@Test
	public void testFact3()
	{
		Math m = new Math();
		
		long result = m.fact(3);
		
		Assert.assertEquals(6, result);
	}	
	
	@Test
	public void testFact15()
	{
		Math m = new Math();
		
		long result = m.fact(15);
		
		Assert.assertEquals(1307674368000l, result);
	}	
	
	@Test
	public void testToRad180()
	{
		Math m = new Math();
		
		double result = m.toRad(180);
		
		Assert.assertEquals(java.lang.Math.PI, result, E);
	}
	
	@Test
	public void testToRad0()
	{
		Math m = new Math();
		
		double result = m.toRad(0);
		
		Assert.assertEquals(0.0, result, E);
	}	
	
	@Test
	public void testToRad90()
	{
		Math m = new Math();
		
		double result = m.toRad(90);
		
		Assert.assertEquals(java.lang.Math.PI / 2.0, result, E);
	}	
}
