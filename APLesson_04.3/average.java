import java.util.Scanner;

public class average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your first number?");
		double num1 = kb.nextDouble();
		System.out.println("What is your second number?");
		double num2 = kb.nextDouble();
		System.out.println("What is your third number?");
		double num3 = kb.nextDouble();
		print(num1, num2, num3, calcAvg(num1,num2,num3));
	}
	public static double calcAvg(double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3;
	}
	public static void print(double num1, double num2, double num3, double average)
	{
		System.out.printf("The average " + num1 + ", " + num2 + ", and " + num3 + " is %.5f", average);
	}
}