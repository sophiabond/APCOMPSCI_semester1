public class XsandOs
{
	public static void main(String[]args)
	{
		String [][] XsandOs = new String [4][4];
		for(int i = 0; i < XsandOs.length; i++)
		{
			for(int j = 0; j <XsandOs[i].length; j++)
			{
				int pick = (int)(Math.random() * 2) + 1;
				if(pick == 1)
					XsandOs[i][j] = "x";
				if(pick == 2)
					XsandOs[i][j] = "o";
				System.out.println(XsandOs[i][j] + "\t");
			}
			System.out.println();
		}
	}
}