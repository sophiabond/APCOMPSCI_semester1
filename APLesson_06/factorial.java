import java.util.Scanner;

public class factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int num = kb.nextInt();
		int factorial = 1;
		
		for (int i = 1; i<= num; i++)
		{
			factorial = factorial*i;
		}
		System.out.println("The factorial of your number is " + factorial);
	}
}