public class Song
{
	public static void main(String[]args)
	{
	
		String chorus = "Na Na Na Na";
		String line1 = "Hey Hey Hey";
		String line2 = "Goodbye!";
		
		sing(chorus, 2);
		sing(line1, 1);
		sing(line2, 1);
	}
	public static void sing(String lyric, int repeat)
	{
		for (int i =1; i <=repeat; i++)
		{
			System.out.println(lyric);
		}
	}
}