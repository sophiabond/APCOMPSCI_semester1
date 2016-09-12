import java.util.Scanner; //import Statement

public class calculations
{
	public static void main(String [] args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("Please Enter a Number ");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		System.out.println("Your number to the fifth power is " + num*num*num*num*num);
		
		
	}
}