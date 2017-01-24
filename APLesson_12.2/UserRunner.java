import java.util.Scanner;

public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String first = kb.next();
		System.out.println("Enter your last name:");
		String last = kb.next();
		
		System.out.println("Would you like to use a public avatar?");
		String choice = kb.next();
		if(choice.equals("n"))
		{ //2 parameters- will use first constructor
			User pH1 = new User(first, last);
			System.out.println(pH1);
		}
		if(choice.equals("y"))
		{
			System.out.println("Enter your avatar name:");
			String avatar = kb.next();
			//3 parameters - will use second constructor
			User pH2 = new User(first, last, avatar);
			System.out.println(pH2);
		}
	}
}