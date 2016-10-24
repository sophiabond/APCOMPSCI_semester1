import java.util.Scanner;

public class BMI
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Please enter your Height in inches");
		double ht = kb.nextDouble();
		
		System.out.println("Please enter your Weight in pounds");
		double wt = kb.nextDouble();
		
		double bmi = calcBMI(ht, wt);
		
		System.out.println("Your BMI is " + bmi);
		System.out.println("You are " + BMI(bmi));
	}
	public static double calcBMI(double h, double w)
	{
		return (((w)/(h*h))*703);
	}
	public static String BMI(double bmi)
	{
		if (bmi < 18.5)
			return "underweight";
		else if (bmi < 25)
			return "normal";
		else if (bmi < 30)
			return "overweight";
		else if (bmi < 35)
			return "obese";
		else if (bmi < 40)
			return "very obese";
		else
			return "morbidly obese";
			
	}
}