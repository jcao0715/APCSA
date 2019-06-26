
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Jing Cao
 * @version 06/26/19
 */
import java.util.*;
public class ShapesTester4
{
    public static void main(String []args)
    {
        Rectangle4 one = new Rectangle4(12, 20);
        Rectangle4 two = new Box4(4, 4, 4);
        Rectangle4 three = new Box4(4, 12, 8);
        Rectangle4 four = new Cube4(4, 4, 4);
        Rectangle4 five = new SquarePrism4(4, 4, 8);
        Rectangle4 six = new Square4(5, 5);

        //Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add( one );
        shapes.add( two );
        shapes.add( three );
        shapes.add( four );
        shapes.add( five );
        shapes.add( six );

        System.out.println("My shapes: ");
        System.out.println();
        for(Rectangle4 rect: shapes)
        {
        	System.out.println(rect);
        	//showEffectBoth(rect);
            System.out.println();
        }

        System.out.println();
        System.out.println("Test for equality: ");
        System.out.println();
        System.out.println(two.equals(four));
        System.out.println();
        System.out.println(three.equals(four));
    }

    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }

}