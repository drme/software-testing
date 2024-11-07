package sorters;

public class Calc
{
	private int r;
	
	public void clear()
	{
		this.r = 0;
	}
	
	public void add(int x)
	{
		this.r += x;
	}
	
	public void mul(int x)
	{
		this.r *= x;
	}
	
	public int getResult()
	{
		return this.r;
	}
}
