import java.util.Scanner;

public class TwoIntegersRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = input.nextInt();
		System.out.println("Enter another number: ");
		int num2 = input.nextInt();
		TwoIntegers object = new TwoIntegers(num1, num2);
		System.out.println(object.arithmetic());
		System.out.println(object.comparingIntegers());
		System.out.println(object.oddOrEven());
		System.out.println(object.multiples());
	}
}
