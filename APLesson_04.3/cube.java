import java.util.Scanner;

public class cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of one side of your cube?");
		double side = kb.nextDouble();
		print(side, calcSurf(side));
	}
	public static double calcSurf(double side)
	{
		return side*side*6;
	}
	public static void print(double side, double SA)
	{
		System.out.printf("The surface area of a cube whose sides are " + side + " in length is %.5f.", SA);
	}
}