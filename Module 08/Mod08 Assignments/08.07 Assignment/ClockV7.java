/*
 *
 * Purpose: 
 *
 * @author Jing Cao
 * @version 01/15/19
 */

public class ClockV7
{
	private double myTime1;
	private double myTime2;

	ClockV7(double t1, double t2)
	{
		myTime1 = t1;
		myTime2 = t2;
	}

	public double calcDiffHrs()
	{
		return Math.abs(myTime2 - myTime1);
	}

	public double calcDiffMin()
	{
		return Math.abs(myTime2 - myTime1) * 60;
	}
	
}