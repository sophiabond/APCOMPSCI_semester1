import java.util.Scanner;

public class Mph
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter a distance:");
		int distance = kb.nextInt();
		System.out.println("Enter number of hours:");
		int hours = kb.nextInt();
		System.out.println("Enter number of minutes:");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(object.getDist() + " miles in " + object.getHours() + " hours = " + object.getmph() + " mph");
		
	}
}
