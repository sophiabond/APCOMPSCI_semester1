import java.util.Scanner;
public class GPACalculator
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Please enter your class grades");
		
		System.out.println("Please enter your math grade");
		String math = kb.nextLine();
		
		System.out.println("Please enter your english grade");
		String english = kb.nextLine();
		
		System.out.println("Please enter your history");
		String history = kb.nextLine();
		
		System.out.println("Please enter your science");
		String science = kb.nextLine();
		
		System.out.println("Please enter your internship grade");
		String internship = kb.nextLine();
		
		System.out.println("Please enter your drama grade");
		String drama = kb.nextLine();
		
		System.out.println("Please enter your computer science grade");
		String computerscience = kb.nextLine();
		
		double gPoints = ((calcPoints(math)) + (calcPoints(english)) + (calcPoints(history)) + (calcPoints(science)) + (calcPoints(internship)) + (calcPoints(drama)) + (calcPoints(computerscience)))/7;
		
		System.out.println("Your GPA is " + gPoints);
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		
			return 0.0;
	}
}