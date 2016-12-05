import java.util.Scanner;

public class compound_interest
{
	public static void main(String[]args)
	{
		compound_interest total = new compound_interest();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter interest rate");
		double rate = kb.nextDouble();
		System.out.println("Enter the original amount borrowed");
		double principle = kb.nextDouble();
		System.out.println("Enter the number of times the loan is compound in a year");
		double compounded = kb.nextDouble();
		System.out.println("Enter the time of loan in years");
		double time = kb.nextDouble();
		double total_pay = total.Total_pay(rate, principle, compounded, time);
		System.out.printf("The total pay per month is \n%10.2f", total_pay);
		
	}
	public double Total_pay(double rate, double principle, double compounded, double time)
	{
		return ((principle*Math.pow(1+(rate/compounded), compounded*time))/(12*time));
	}
}