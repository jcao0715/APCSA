
/**
 * This class defines an Oval Cylinder object that extends an Oval.
 *
 * @author Jing Cao
 * @version 06/25/19
 */

public class OvalCylinder2 extends Oval2
{
    // instance variables
    private int height;

    // Constructor for objects of class OvalCylinder
    public OvalCylinder2(int x, int y, int rad1, int rad2, int h)
    {
        // call superclass
        super(x, y, rad1, rad2);

        // initialize instance variables
        height = h;
    }

    public int getHeight()
    {
        return height;
    }

    public String getName()
    {
        return "OvalCylinder2";
    }
}