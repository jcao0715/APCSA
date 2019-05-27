/**
 * Purpose: Write a program to calculate the value of pi by simulating throwing darts at a dart board.
 *
 * @author Jing Cao
 * @version 05/25/19
 */

public class DartsTester
{
	public static void main(String [] args)
	{
		Darts obj1 = new Darts(1500, 10);

		System.out.println(obj1.hits(obj1.getNumTrials()));
	}
}