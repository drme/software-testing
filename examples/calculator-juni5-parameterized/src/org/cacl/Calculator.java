package org.cacl;

enum Operation
{
	ADD, MUL, Sub, Div
}

public class Calculator
{
	private Double result = null;
	private Operation operation = null;

	public void setNumber(Double number)
	{
		if (this.operation == null)
        {
            this.result = number;
            
            return;
        }
		
		switch (this.operation)
		{
	//		case null:
		//		this.result = number;
			//	break;
			case ADD:
				this.result += number;
				break;
			case MUL:
				this.result *= number;
				break;
			case Sub:
				this.result -= number;
				break;
			case Div:
				this.result /= number;
				break;
			default:
				break;
		}
	}

	public void setOperation(Operation operation)
	{
		this.operation = operation;
	}

	public Double getResult()
	{
		return this.result;

	}
}
