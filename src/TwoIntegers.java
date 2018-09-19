
public class TwoIntegers {

	private int num;
	private int num2;
	
	public TwoIntegers()
	{
		num = 0;
		num2 = 0;
	}
	
	public TwoIntegers(int num, int num2)
	{
		this.num = num;
		this.num2 = num2;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public int getNum2()
	{
		return num2;
	}
	
	public void setNum(int num)
	{
		this.num = num;
	}
	
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	
	public String arithmetic()
	{
		int numsum = num + num2;
		int numproduct = num * num2;
		int numdifference = num - num2;
		int numquotient = num / num2;
		
		return num + " + " + num2 + " = " + numsum + 
				", " + num + " * " + num2 + " = " + numproduct;
		
	}
	public int larger()
	{
		if(num >= num2)
			return num;
		else
			return num2;
	}
	
	public boolean isEven()
	{
		if(num + num2 = 2 % ==0)
			return true;
	}
	
}
