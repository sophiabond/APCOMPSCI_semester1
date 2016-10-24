import java.util.Scanner;

public class Adventuregame
{
	static Scanner kb;
	public static void main(String[]args)
	{
		System.out.println("Choose your own adventure! The choices you make will change the way your adventure ends, so choose wisely!");
		System.out.println("You go to seaworld for your first time ever!");
		System.out.println("Go to the shamu show (1) or Go see the jellys (2)?");
		storyChoices();
	}
	public static void storyChoices()
	{
		kb = new Scanner (System.in);
		String choiceA = kb.nextLine();
		if (choiceA.equals("1"))
		{
			System.out.println("You go to the shamu show and get a seat right up front. You see that they are asking for volunteers!");
			System.out.println("Raise your hand to volunteer (1) or sit quietly (2)?");
			String choiceB = kb.nextLine();
			if (choiceB.equals("1"))
			{
				System.out.println("They look directly at you and point in your direction. You have been chosen!");
				System.out.println("They ask you to come up on stage and you do. They tell you to put on a wetsuit and get into the water.");
				System.out.println("Put on the wetsuit and get into the water (1) or back out and go sit down (2)?");
				String choiceC = kb.nextLine();
				if (choiceC.equals("1"))
				{
				System.out.println("Your excited but nervous. You see a large dark shape appear underneath you.");
				System.out.println("You try to swim away but your not fast enough. Shamu eats you.");
				System.out.println("The end");
				}
				else if (choiceC.equals("2"))
				{
					System.out.println("The whole crowd starts to boo you and throw things at you. You are so embarrassed you run out of the show and leave the park all together.");
					System.out.println("The end");
					String choiceD = kb.nextLine();
				}
			}
			else if (choiceB.equals("2"))
			{
				System.out.println("You watch another volunteer hop in the water and start to swim with shamu!");
				System.out.println("Before you know it shamu grabs the volunteer by the arm and drags her under. The whole crowd starts to scream and run frantically trying to save her, but it's too  late.");
				System.out.println("You run out of the show thinking the whole time...phew that could have been you");
				String choiceE = kb.nextLine();
			}
		
		}
		else if (choiceA.equals("2"))
		{
			System.out.println("On your way to the jellys a random man offers you a free icecream.");
			System.out.println("Take the icecream (1) Continue towards the jellys (2)");
			String choiceF = kb.nextLine();
				if (choiceF.equals("1"))
				{
					System.out.println("You take the icecream happily and thank the man!");
					System.out.println("Five minutes after you eat it you don't feel too good...");
					System.out.println("You fall to the ground. You have been poisoned.");
					System.out.println("The end");
				}
				else if (choiceF.equals("2"))
				{
					System.out.println("You make it to the jellys!");
					System.out.println("You look at all the different types of pretty jellyfish.");
					System.out.println("Leave (1) or stay a little while longer (2)");
					String choiceG = kb.nextLine();
					if (choiceG.equals("1"))
					{
						System.out.println("You walk around to many of the other many enclosures and enjoy a great day at Seaworld!");
						System.out.println("The end!");
					}
					else if (choiceG.equals("2"))
					{
						System.out.println("You stay a little while longer and suddenly feel the ground slowly start to shake.");
						System.out.println("An earthquake hits and all the jellyfish enclosures start to crack");
						System.out.println("Tons of water and jellyfish begin to spill onto the floor");
						System.out.println("Suddenly the ceiling begins to break and fall on top of you");
						System.out.println("You die.");
					}
				}
		}
		
	}
}