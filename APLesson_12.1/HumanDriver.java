import java.util.Scanner;

public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter hair color:");
		String hair = kb.nextLine();
		System.out.println("Enter eye color:");
		String eyes = kb.nextLine();
		System.out.println("Enter skin color:");
		String skin = kb.nextLine();
		
		Human object = new Human(hair, eyes, skin);
		System.out.println("My info...\nHair:\t" + object.getHair() + "\nEyes:\t" + object.getEyes() + "\nSkin:\t" + object.getSkin());
		
		object.setHES("black", "shifty", "sleek");
		System.out.println("Friend's info...\nHair:\t" + object.getHair() + "\nEyes:\t" + object.getEyes() + "\nSkin:\t" + object.getSkin());

	}
}