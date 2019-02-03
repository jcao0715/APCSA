/*
 * Purpose: Expand your V7 object implementation class and client class to manage an array of data. Find the minimum, maximum, and averages of values.
 *
 * @author Jing Cao
 * @version 01/30/19
 */

public class ClockV8Tester
{
	public static void main(String[] args)
	{
		ClockV8[] clock = {new ClockV8("Tanya", 2.50, 4.50),
						   new ClockV8("Miguel", 1.25, 5.60),
						   new ClockV8("Neeti", 12.30, 16.75)};

		for(int i = 0; i < clock.length; i++)
		{
			clock[i].calcDiffHrs();
			clock[i].calcDiffMin();
		}

		System.out.println(" Name     Time 1    Time 2       Time Difference       Difference");
		System.out.println("	 (hrs) 	    (hrs)             (hrs)	       in Minutes");
		System.out.println("-----------------------------------------------------------------");

		for(int i = 0; i < clock.length; i++)
		{
			System.out.printf("%-8s %4.1f %10.1f %17.1f %18.1f\n", clock[i].getName(),
																   clock[i].getTime1(),
															       clock[i].getTime2(),
																   clock[i].getDiffHrs(),
																   clock[i].getDiffMin());
		}

		System.out.println("-----------------------------------------------------------------");

		double[] hrDiff = {clock[0].getDiffHrs(), clock[1].getDiffHrs(), clock[2].getDiffHrs()};
		double hrMin = Double.MAX_VALUE;
		double hrMax = Double.MIN_VALUE;
		double hrSum = 0;
		double hrAvg = 0;

		for(int i = 0; i < hrDiff.length; i++)
		{
			if(hrDiff[i] < hrMin)
			{
				hrMin = hrDiff[i];
			}

			if(hrDiff[i] > hrMax)
			{
				hrMax = hrDiff[i];
			}

			hrSum += hrDiff[i];
		}

			hrAvg = hrSum / hrDiff.length;

		double[] minDiff = {clock[0].getDiffMin(), clock[1].getDiffMin(), clock[2].getDiffMin()};
		double minMin = Double.MAX_VALUE;
		double minMax = Double.MIN_VALUE;
		double minSum = 0;
		double minAvg = 0;

		for(int i = 0; i < minDiff.length; i++)
		{
			if(minDiff[i] < minMin)
			{
				minMin = minDiff[i];
			}

			if(minDiff[i] > minMax)
			{
				minMax = minDiff[i];
			}

			minSum += minDiff[i];
		}

			minAvg = minSum / minDiff.length;

		System.out.printf("%22s %19.2f %18.2f\n", "MINIMUM: ", hrMin, minMin);
		System.out.printf("%22s %19.2f %18.2f\n", "MAXIMUM: ", hrMax, minMax);
		System.out.printf("%22s %19.2f %18.2f\n", "AVERAGE: ", hrAvg, minAvg);

	}
}