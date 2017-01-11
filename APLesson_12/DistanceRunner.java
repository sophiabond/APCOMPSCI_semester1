import java.util.Scanner;

public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first x-coordinate:");
		int xOne = kb.nextInt();
		System.out.println("Enter your first y-coordinate:");
		int yOne = kb.nextInt();
		System.out.println("Enter your second x-coordinate:");
		int xTwo = kb.nextInt();
		System.out.println("Enter your second y-coordinate:");
		int yTwo = kb.nextInt();
		
		Distance object = new Distance(xOne, yOne, xTwo, yTwo);
		
		System.out.println("The distance between (" + object.getxOne() + ", " + object.getyOne() + ") and (" + object.getxTwo() + ", " + object.getyTwo() + ") is " + object.getDist());
		object.setCoordinates(3, 4, 5, 6);
		System.out.println("The distance between (" + object.getxOne() + ", " + object.getyOne() + ") and (" + object.getxTwo() + ", " + object.getyTwo() + ") is " + object.getDist());
		
	}
}
