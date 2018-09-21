import java.util.Scanner;
public class TwoIntRunner {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		int num = input.nextInt();
		int num2 = input.nextInt();
		TwoIntegers ti = new TwoIntegers(num , num2);
		String arithmetic = ti.arithmetic();
		System.out.println(arithmetic + " ");
		int larger = ti.larger();
		System.out.println(larger + " "
				+ "is the larger number. ");
		boolean isEven = ti.isEven();
		System.out.println("If the sum of these two numbers is even then it is true, so this number is " 
		+ isEven);
		boolean isMultiple = ti.isMultiple();
		System.out.println("If num1 is a multiple of num2 then it is true. so this number is " 
		+ isMultiple);
		
	}			
}
