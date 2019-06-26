/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Jing Cao
 * @version 06/26/19
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "Box - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }

    public String equals(Box4 obj)
    {
        if(getLength() == obj.getLength() && getWidth() == obj.getWidth() && getHeight() == obj.getHeight())
        {
            return toString() + " IS same size as " + obj.toString();
        }

        else
        {
            return toString() + " is NOT same size as " + obj.toString();
        }
    }
}