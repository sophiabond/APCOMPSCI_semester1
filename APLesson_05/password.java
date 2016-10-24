import java.util.Scanner;

public class password
{
	static String user;
	static String pass;
	static String userGuess;
	static String passGuess;
	
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		user = "sophbond";
		pass = "Bond007";
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("Please enter your username");
		userGuess = kb.next();
		System.out.println("Please enter your password");
		passGuess = kb.next();
		
		if (userGuess.equals(user) && passGuess.equals(pass))
		{
			System.out.println("Access Granted");
		}
		else
		{
			if (user.equals(userGuess))
			{
				System.out.println("Incorrect password");
				passCheck();
			}
			else if(pass.equals(passGuess))
			{
				System.out.println("Incorrect Username");
				passCheck();
			}
			else
				System.out.println("Incorrect username and password");
				passCheck();
			
		}
	}
}