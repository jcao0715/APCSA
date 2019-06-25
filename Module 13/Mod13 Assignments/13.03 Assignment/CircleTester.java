/**
 * This class tests different Circle2 objects.
 *
 * @author Jing Cao
 * @version 06/25/19
 */
import java.util.*;

public class CircleTester
{
	public static void main(String [] args)
	{
		Circle2 obj1 = new Circle2(2, 4, 5);
		Circle2 obj2 = new Cylinder2(10, 15, 7, 8);
		Circle2 obj3 = new Oval2(25, 10, 5, 9);
		Circle2 obj4 = new OvalCylinder2(40, 10, 5, 10, 13);

		ArrayList<Circle2> circles = new ArrayList<Circle2>();
		circles.add(obj1);
		circles.add(obj2);
		circles.add(obj3);
		circles.add(obj4);

		for(Circle2 circle : circles)
		{
			System.out.println(showCenter(circle));
		}
	}

	public static String showCenter(Circle2 obj)
	{
		return "For this " + obj.getName() + " the center is at " + obj.getCenter() + ".";
	}
}