/*
 *
 * Create a program that calculates difference between 2 times and convert the difference into minutes.
 *
 * @author Jing Cao
 * @version 01/15/19
 */

public class ClockV3{

	public ClockV3()
	{
	}

	public double calcTimeDiff(double time1, double time2)
	{
		return Math.abs(time1 - time2);
	}

	public double calcHrsToMin(double timeDiff)
	{
		return timeDiff * 60;
	}

	public static void main(String[] args)
	{
		double time1, time2;
		double timeDiff, timeMin;

		time1 = 2.5;
		time2 = 4.5;
		timeDiff = 0;
		timeMin = 0;

		ClockV3 clock = new ClockV3();

		timeDiff = clock.calcTimeDiff(time1, time2);
		timeMin = clock.calcHrsToMin(timeDiff);

		System.out.println("			Time Trials	");
		System.out.println("Time 1		Time 2 		Time Difference		Difference");
		System.out.println("(hrs)		(hrs)		(hrs)			in Minutes");
		System.out.println("__________________________________________________________________");
		System.out.println(time1 + "	        " + time2 + "	       	 " + timeDiff + "			" + timeMin);

	}
}