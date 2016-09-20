import java.util.Scanner;

public class Receipt
{
	public static void main(String[]args)
	{
		//declared objects
		Receipt form = new Receipt();
		Scanner kb = new Scanner(System.in);
		
		//user inputs
		System.out.println("Please enter item 1");
		String item1 = kb.next();
		
		System.out.println("Please enter the price");
		double price1 = kb.nextDouble();
		
		System.out.println("Please enter item 2");
		String item2 = kb.next();
		
		System.out.println("Please enter the price");
		double price2 = kb.nextDouble();
		
		System.out.println("Please enter item 3");
		String item3 = kb.next();
		
		System.out.println("Please enter the price");
		double price3 = kb.nextDouble();
		
		String subtotal = "Subtotal";
		double subtotal1 = price1 + price2 + price3;
		
		String tax = "Tax:";
		double tax1 = subtotal1*.08;
		
		String total = "Total:";
		double total1 = subtotal1 + tax1;
		
		System.out.println("\t\t\t" + "<<<<Receipt>>>>");
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(subtotal, subtotal1);
		form.format(tax, tax1);
		form.format(total, total1);
		
		System.out.println("\n" + "\t" + "___________________________________");
		System.out.println("\t" + "  Thank you for shopping with us!");
	
		
	}
		public void format(String item, double price)
		{
			System.out.printf("\n%20s   %10.2f", item, price);
			
		}

		
	
}
