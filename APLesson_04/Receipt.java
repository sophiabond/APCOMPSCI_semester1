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
		System item1 = kb.next();
		
		System.out.println("Please enter the price");
		double price1 = kb.nextdouble();
		
		System.out.println("Please enter item 2");
		System item2 = kb.next();
		
		System.out.println("Please enter the price");
		double price2 = kb.nextdouble();
		
		System.out.println("Please enter item 3");
		System item3 = kb.next();
		
		System.out.println("Please enter the price");
		double price3 = kb.nextdouble();
		
		String subtotal = "Subtotal";
		double subtotal1 = price1 + price2 + price3;
		
		String tq
		
		//print your header <<<<receipt>>>>
		form.receipt(item1, price1);
		form.receipt(item2, price2);
		form.receipt(item3, price3);
		//subtotal
		System.out.println();
		//tax
		System.out.println();
		//total
		System.out.println();
		//add your line use ____
		
		//print thank you message
		
	}
		public void receipt(String item, String price);
	{
		System.out.printf("\n%20s   %10.2f", item, price);
	}
}
