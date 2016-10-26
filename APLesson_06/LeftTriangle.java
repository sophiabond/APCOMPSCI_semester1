import java.util.Scanner;

public class LeftTriangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a word ");
		String word = kb.nextLine();
		int length = word.length();
		
		for (int i=0; i <= length; i++)
		{
			System.out.println(word.substring(i, length));
		}
	}
}