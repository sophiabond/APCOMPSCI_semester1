import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How old are you? ");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Really? " + num + "?" + " You look like a five year old..." );
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		//search for the next integer that the user enters
		String name = keyboard.next();
		
		//print the results...
		System.out.println("Really? " + name + "?" + " I'm sorry you have such a stupid name..." );
		
		//prompt for user input
		System.out.println("What do you do for fun? ");
		
		//search for the next integer that the user enters
		String fun = keyboard.next();
		
		//print the results...
		System.out.println(fun + "?" + " I thought only nerds did that for fun" );
		
		//prompt for user input
		System.out.println("What kind of music do you like? ");
		
		//search for the next integer that the user enters
		String music = keyboard.next();
		
		//print the results...
		System.out.println(music + "?" + " Ohh so your one of those girls..." );
		
		//prompt for user input
		System.out.println("How many siblings do you have? ");
		
		//search for the next integer that the user enters
		String siblings = keyboard.next();
		
		//print the results...
		System.out.println(siblings + "?" + " Well you're obviously not the favorite..." );
		
		//prompt for user input
		System.out.println("What do you want to be when you grow up?");
		
		//search for the next integer that the user enters
		String growup = keyboard.next();
		
		//print the results...
		System.out.println(growup + "?" + " LOL good luck with that");
		
		
		
		
		
	
		
		
		
		
	}
}