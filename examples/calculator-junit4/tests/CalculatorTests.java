import junit.framework.Assert;

import org.junit.Test;

import eu.calc.Calculator;
import eu.calc.Operator123;


public class CalculatorTests
{
	@Test
	public void testAdd22()
	{
		Calculator calc = new Calculator();
		
		calc.enterNumber(2);
		calc.enterOperator(Operator123.Plus);
		calc.enterNumber(2);
		
		float result = calc.getResult();
		
		Assert.assertEquals(4.0f, result, 0.001);
	}

	@Test
	public void testAdd23()
	{
		Calculator calc = new Calculator();
		
		calc.enterNumber(2);
		calc.enterOperator(Operator123.Plus);
		calc.enterNumber(3);
		
		float result = calc.getResult();
		
		Assert.assertEquals(5.0f, result, 0.001);
	}

	@Test
	public void testAdd25()
	{
		Calculator calc = new Calculator();
		
		calc.enterNumber(2);
		calc.enterOperator(Operator123.Plus);
		calc.enterNumber(-5);
		
		float result = calc.getResult();
		
		Assert.assertEquals(-3, result, 0.001);
	}

	@Test
	public void testMinus22()
	{
		Calculator calc = new Calculator();
		
		calc.enterNumber(2);
		calc.enterOperator(Operator123.Minus);
		calc.enterNumber(2);
		
		float result = calc.getResult();
		
		Assert.assertEquals(0, result, 0.001);
	}

	@Test
	public void testMinus20()
	{
		Calculator calc = new Calculator();
		
		calc.enterNumber(2);
		calc.enterOperator(Operator123.Minus);
		calc.enterNumber(0);
		
		float result = calc.getResult();
		
		Assert.assertEquals(2, result, 0.001);
	}

	@Test
	public void testMinus1122()
	{
		Calculator calc = new Calculator();
		
		calc.enterNumber(-2);
		calc.enterOperator(Operator123.Minus);
		calc.enterNumber(2);
		
		float result = calc.getResult();
		
		Assert.assertEquals(-4, result, 0.001);
	}

	@Test(expected=Exception.class)
	public void testsdfgsdf2()
	{
		Calculator calc = new Calculator();
		
		calc.enterNumber(2);
		calc.enterOperator(Operator123.Plus);
		calc.enterNumber(Integer.MAX_VALUE);
		
		float result = calc.getResult();
	}

	
	@Test
	public void testMinusBignumber()
	{
		Calculator calc = new Calculator();
		
		calc.enterNumber(2000000);
		calc.enterOperator(Operator123.Minus);
		calc.enterNumber(444);
		
		float result = calc.getResult();
		
		Assert.assertEquals(1999556, result, 0.001);
	}

	@Test
	public void test228()
	{
		Calculator calc = new Calculator();
		
		calc.enterNumber(2);
		calc.enterOperator(Operator123.Plus);
		calc.enterNumber(2);
		calc.enterOperator(Operator123.Minus);
		calc.enterNumber(8);
		
		float result = calc.getResult();
		
		Assert.assertEquals(-4, result, 0.001);
	}
	

	@Test
	public void testMul22()
	{
		Calculator calc = new Calculator();
		
		calc.enterNumber(2);
		calc.enterOperator(Operator123.Multiply);
		calc.enterNumber(2);
		
		float result = calc.getResult();
		
		Assert.assertEquals(4, result, 0.001);
	}
	
	@Test
	public void test27()
	{
		Calculator calc = new Calculator();
		
		calc.enterNumber(2);
		calc.enterOperator(Operator123.Multiply);
		calc.enterNumber(7);
		
		float result = calc.getResult();
		
		Assert.assertEquals(14, result, 0.001);
	}
	
	@Test
	public void test222()
	{
		Calculator calc = new Calculator();
		
		calc.enterNumber(2);
		calc.enterOperator(Operator123.Plus);
		calc.enterNumber(2);
		calc.enterOperator(Operator123.Multiply);
		calc.enterNumber(2);
		
		float result = calc.getResult();
		
		Assert.assertEquals(6, result, 0.001);
	}
	
	
	
}
