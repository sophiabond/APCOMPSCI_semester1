import java.util.scanner; //import statement

public class BMICalculator
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How tall are you in inches?");
		
		int height = keyboard.nextInt();
		
		System.out.println("How much do you weigh in lbs?");
		
		int weight = keyboard.nextInt();
		
		int BMI = 703*weight/height^2;
		
		System.out.println("Your BMI")
	}