package org.cacl;

import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTests
{
	@ParameterizedTest
	@MethodSource
	void testOpTwoNumbers(Double a, Operation op, Double b, Double expected)
	{
		var calc = new Calculator();
		
		calc.setNumber(a);
		calc.setOperation(op);
		calc.setNumber(b);
		
		var result = calc.getResult();
		
		Assert.assertEquals(expected, result);
	}
	
	static Stream<Arguments> testOpTwoNumbers()
	{
		return Stream.of(Arguments.of(2.0, Operation.ADD, 2.0, 4.0), 
				Arguments.of(9999999999999.0, Operation.ADD, 99999999999999999.0, 3.0),
				Arguments.of(2.0, Operation.ADD, 0.0, 2.0)
				
				
	//			Arguments.of(2.0, Operation.MUL, 2.0, 4.0), 
	//			Arguments.of(2.0,Operation.MUL,  1.0, 2.0),
	//			Arguments.of(2.0,Operation.MUL,  0.0, 0.0)		
				
				);
	
	}
	
	@Test
	void test2Plus2Mult2()
	{
		var calc = new Calculator();
		
		calc.setNumber(2.0);
		calc.setOperation(Operation.ADD);
		calc.setNumber(2.0);
		calc.setOperation(Operation.MUL);
		calc.setNumber(2.0);
		
		var result = calc.getResult();
		
		Assert.assertEquals(8.0, result, 0.000001);
	}
}
