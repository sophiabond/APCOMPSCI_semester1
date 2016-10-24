import java.util.Random;

public class dice
{
	static int player, computer;
	static String winner;
	
	public static void main(String[]args)
	{
		Random rd = new Random();
		
		player = rd.nextInt(6)+1;
		computer = rd.nextInt(6)+1;
		diceRoll();
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("An the winner is " + winner);
	}
	public static void diceRoll()
	{
		if(player>computer)
			winner="You!";
		if(player<computer)
			winner="Computer!";
	}
}