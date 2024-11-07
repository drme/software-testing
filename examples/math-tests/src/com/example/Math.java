package com.example;

class Math
{
	private static int N = 20;
	
	public double toCel(int f)
	{
		int temp_f = f;
		double temp_c = (temp_f - 32) * 5.0 / 9.0;
		
		
		return temp_c;
	}
	
	
	public double sin(double x)
	{
		x = toRad(x);
		
		//sin x     = x - x^3/3! + x^5/5! - x^7/7! + ...
		
		double result = x;
		
		for (long i = 3; i < N; i+=2)
		{
			if ((long)(i/2) % 2 == 0)
			{
				result += java.lang.Math.pow(x, i) / fact(i);
			}
			else
			{
				result -= java.lang.Math.pow(x, i) / fact(i);
			}
		}
		
		
		return result;
	}

	double toRad(double x)
	{
		x = x * java.lang.Math.PI / 180.0;
		return x;
	}
	
	public long fact(long x)
	{
		long result = x;
		
		for (long i = x - 1; i > 1; i--)
		{
			result *= i;
		}
		
		return result;
	}
}
