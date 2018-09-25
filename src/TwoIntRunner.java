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
		System.out.println("If sum is even: " 
		+ isEven);
		boolean isMultiple = ti.isMultiple();
		System.out.println("If first number is multiple of second number: " 
		+ isMultiple);
		
	}			
}
