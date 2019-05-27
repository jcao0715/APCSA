/**
 * Purpose: Write a program to calculate the value of pi by simulating throwing darts at a dart board.
 *
 * @author Jing Cao
 * @version 05/25/19
 */

public class Darts
{
	private int myDartThrows;
	private int myNumTrials;
	private double average = 0;

	public Darts(int dartThrows, int numTrials)
	{
		myDartThrows = dartThrows;
		myNumTrials = numTrials;
	}

	public double calcPi(int numTrials, int dartThrows)
	{
		double x, y;
		int numHits = 0;

		for(int i = 0; i < dartThrows; i++)
		{
			x = Math.random();
			y = Math.random();

			if(Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(1.0, 2))
			{
				numHits++;
			}
		}

		double pi = 4 * (double)numHits / dartThrows;

		return pi;

	}

	public double calcAvg()
	{
		double total = 0;

		for(int i = 0; i < myNumTrials; i++)
		{
			double approxPi = calcPi(myNumTrials, myDartThrows);
			total += approxPi;
		}

		average = total / myNumTrials;

		return average;
	}

	public int getNumTrials()
	{
		return myNumTrials;
	}

	public int getDartThrows()
	{
		return myDartThrows;
	}

	public double getAvg()
	{
		return average;
	}

	public String toString()
	{
		return "Estimate of Pi: " + average;
	}
}