import java.lang.Math.*;
public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance()
	{
		distance = 0;
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}
	
	public Distance(int x, int y, int xx, int yy)
	{
		xOne = x;
		yOne = y;
		xTwo = xx;
		yTwo = yy;
		distance = 0;
	}
	
	public void setCoordinates(int x, int y, int xx, int yy)
	{
		xOne = x;
		yOne = y;
		xTwo = xx;
		yTwo = yy;
	}
	
	public int getxOne()
	{
		return xOne;
	}
	
	public int getyOne()
	{
		return yOne;
	}
	
	public int getxTwo()
	{
		return xTwo;
	}
	
	public int getyTwo()
	{
		return yTwo;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}