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
	private int numHits;

	public Darts(int dartThrows, int numTrials)
	{
		myDartThrows = dartThrows;
		myNumTrials = numTrials;
	}

	public int hits(int numTrials)
	{
		double x;
		double y;

		for(int i = 0; i < numTrials; i++)
		{
			x = Math.random();
			y = Math.random();

			if(Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(1.0, 2))
			{
				numHits++; 
			}
		}

		return numHits;
	}

	public double calcPi(double numHits, double dartThrows)
	{
		double pi = (4 * ((double)numHits) / dartThrows);

		return pi;
	}

	public int getNumTrials()
	{
		return myNumTrials;
	}

	public int getDartThrows()
	{
		return myDartThrows;
	}

	public int getNumHits()
	{
		return numHits;
	}

	public String toString()
	{
		double total = 0;

		for(int i = 0; i < myNumTrials; i++)
		{
			int hits = hits(myDartThrows);
			double approxPi = calcPi(hits, myDartThrows);
			total += approxPi;
		}

		double average = (total / myNumTrials);

		return "Estimate of Pi: " + average;
	}
}