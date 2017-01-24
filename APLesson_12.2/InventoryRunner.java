import java.util.Scanner;

public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the item manufacturer:");
		String man = kb.next();
		System.out.println("Enter the item name:");
		String nam = kb.next();
		
		System.out.println("Will you be entering category and price information?");
		String choice = kb.next();
		if(choice.equals("n"))
		{
			Inventory object = new Inventory(man, nam);
			System.out.println(object);
		}
		if(choice.equals("y"))
		{
			System.out.println("Enter a category:");
			String cat = kb.next();
			System.out.println("Enter a price:");
			int pric = kb.nextInt();
			Inventory object1 = new Inventory(man, nam, cat, pric);
			System.out.println(object1);
		}
	}
}