/*
 * Purpose: Expand your V7 object implementation class and client class to manage an array of data. Find the minimum, maximum, and averages of values.
 *
 * @author Jing Cao
 * @version 01/30/19
 */

public class ClockV8
{
	private double myTime1, myTime2;
	private double myHrDiff, myMinDiff;
	private String myName;

	ClockV8(String name,double t1, double t2)
	{
		myName = name;
		myTime1 = t1;
		myTime2 = t2;
		double myHrDiff = 0.0;
		double myMinDiff = 0.0;
	}

	public void calcDiffHrs()
	{
		myHrDiff = Math.abs(myTime1 - myTime2);
	}

	public double getDiffHrs()
	{
		return myHrDiff;
	}

	public void calcDiffMin()
	{
		myMinDiff = Math.abs(myTime2 - myTime1) * 60;
	}

	public double getDiffMin()
	{
		return myMinDiff;
	}

	public double getTime1()
	{
		return myTime1;
	}

	public double getTime2()
	{
		return myTime2;
	}

	public void setTime1(double t1)
	{
		myTime1 = t1;
	}

	public void setTime2(double t2)
	{
		myTime2 = t2;
	}
	
	public String getName()
	{
		return myName;
	}

	public void setName(String name)
	{
		myName = name;
	}

	public String toString()
	{
		return String.format("%-8s %12d %9d %14.1f %13.1f%n", myName, myTime1, myTime2, myHrDiff, myMinDiff);
	}
}