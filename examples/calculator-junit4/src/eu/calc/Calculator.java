package eu.calc;

import javax.management.RuntimeErrorException;

public class Calculator
{
	public float getResult()
	{
		/// TODO:
		
		throw new RuntimeErrorException(null, "Not impel..");
		
		//return this.result;
	}
	
	public void enterOperator(Operator123 operator)
	{
		this.expression += " " + operator.toString();
		
		//this.operator123 = operator;
	}
	
	public void enterNumber(int number)
	{
		this.expression += " " + number;
		
/*		switch(this.operator123)
		{
			case Plus:
				result += number;
				break;
			case Minus:
				result -= number;
				break;
			case Multiply:
				result *= number;
				break;
			case None:
				this.result = number;
				break;
				default:
					throw new RuntimeErrorException(null, "SDFSDF");
		} */
	}
	
	private String expression = "";
	
	//private Operator123 operator123 = Operator123.None; 
	//private float result = 0;
}
