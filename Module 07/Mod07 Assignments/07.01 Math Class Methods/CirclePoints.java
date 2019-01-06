/*
 * Purpose: Write a program to calculate the (x, y) coordinates of points on a circle of a given radius.
 *
 * @author Jing Cao
 * @version 1/5/19
 */
import java.util.*;

public class CirclePoints{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double radius;
		double x;
		double y;

		System.out.print("Enter a value for radius: ");
		radius = in.nextDouble();
		x = radius;

		System.out.println("Points on a Circle with a Radius of " + radius);
		System.out.printf("%8s %8s %8s %8s%n", "x1", "y1", "x2", "y2");
		System.out.println("*******************************************");

		for(int i = 0; i < (radius * 20 + 1); i ++)
		{
			y = Math.sqrt(Math.pow(radius, 2) - Math.pow(x, 2));
			System.out.printf("%8.2f %8.2f %8.2f %8.2f%n", x, y, x, -1 * y);
			x -= 0.1;
		}
	}
}