/**
 * Purpose: Write a program to calculate the value of pi by simulating throwing darts at a dart board.
 *
 * @author Jing Cao
 * @version 01/22/19
 */

import java.util.Scanner;

public class EstimatePi
{
	public double x = (2 * Math.random()) - 1, y = (2 * Math.random()) - 1; radius = 1.0;
	public double numX = 0, numY = 0, numHits = 0, pi = 0, average = 0;
	public int dartThrows = 0, numTrials = 0;

	public static int hits (double x, double y, int trials)
	{
		numHits = 0;

		for(int i = 1, i < trials; i++)
		{
			x = (2 * Math.random()) - 1;
			y = (2 * Math.random()) - 1;

			if((Math.pow(x, 2) + Math.pow(y, 2)) <= (Math.pow(radius, 2)))
			{
				numHits ++;
			}
		}

		return numHits;
	}

	public static double calcPi(double numHits, double dartThrows)
	{
		double pi = (4 * ((double)numHits / dartThrows));
		return pi;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("How many darts per trial?");
		dartThrows = in.nextInt();

		System.out.println();

		System.out.println("How many truals?");
		numTrials = in.nextInt();

		double total = 0.0;

		for(int i = 0; i < numTrials; i++)
		{
			int hits
		}
	}
}