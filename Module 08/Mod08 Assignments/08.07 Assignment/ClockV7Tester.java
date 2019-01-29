/*
 * Purpose: Convert your V3 object class to V7 implementation and client classes and instantiate multiple objects.
 *
 * @author Jing Cao
 * @version 01/15/19
 */

public class ClockV7Tester
{
	public static void main(String [] args)
	{
		double timeA1, timeA2, timeB1, timeB2, timeC1, timeC2;
		double hourDiff1, hourDiff2, hourDiff3, minDiff1, minDiff2, minDiff3;
		String name1, name2, name3;

		timeA1 = 2.50; timeB1 = 1.25; timeC1 = 12.30;
		timeA2 = 4.50; timeB2 = 5.60; timeC2 = 16.75;
		name1 = "Tanya"; name2 = "Miguel"; name3 = "Neeti";

		ClockV7 obj1 = new ClockV7(timeA1, timeA2);
		ClockV7 obj2 = new ClockV7(timeB1, timeB2);
		ClockV7 obj3 = new ClockV7(timeC1, timeC2);

		hourDiff1 = obj1.calcDiffHrs();
		hourDiff2 = obj2.calcDiffHrs();
		hourDiff3 = obj3.calcDiffHrs();

		minDiff1 = obj1.calcDiffMin();
		minDiff2 = obj2.calcDiffMin();
		minDiff3 = obj3.calcDiffMin();

		System.out.println("			Time Trials				");
		System.out.println("Name 	Time 1		Time 2		Time Difference		Difference");
		System.out.println("	(hrs)		(hrs)		    (hrs)		in Minutes");
		System.out.println("-------------------------------------------------------------------------");
		System.out.printf("%-6s %6.2f %15.2f %18.2f %21.0f%n", name1, timeA1, timeA2, hourDiff1, minDiff1);
		System.out.printf("%-6s %6.2f %15.2f %18.2f %21.0f%n", name2, timeB1, timeB2, hourDiff2, minDiff2);
		System.out.printf("%-6s %6.2f %15.2f %18.2f %21.0f%n", name3, timeC1, timeC2, hourDiff3, minDiff3);

	}
}