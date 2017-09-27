public class TwoIntegers
{
	private int num1;
	private int num2;
	
	public TwoIntegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public TwoIntegers()
	{
		this.num1 = 0;
		this.num2 = 0;
	}
	public int getnum1()
	{
		return num1;
	}
	public int getnum2()
	{
		return num2;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public String arithmetic()
	{
		return ("Sum = " + (num1 + num2) + "\n (Product = " + (num1 * num2) + 
		"\n (Diffrence = " + (num1 - num2) + "\n (Quotient = " + (num1 / num2));
	}
	public Double comparingIntegers()
	{
		double number = Double.NaN;
		if(num1 > num2)
		{
			number = num1;
		}
		else if(num1 < num2)
		{
			number = num2;
		}
		return number;
	}
}
