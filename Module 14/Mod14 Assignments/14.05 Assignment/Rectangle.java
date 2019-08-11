/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Jing Cao
 * @version 08/11/19
 */

public class Rectangle
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int length, int width)
    {
        // initialize instance variables
        this.length = l;
        this.width = w;
    }

    // return the height
    public int getLength()
    {
        return this.length;
    }

    // return the width
    public int getWidth()
    {
        return this.width;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "Rectangle - " + getLength() + " X " + getWidth();
    }

    public String equals(Rectangle4 obj)
    {
        if(getLength() == obj.getLength() && getWidth() == obj.getWidth())
        {
            return toString() + " IS same size as " + obj.toString();
        }

        else
        {
            return toString() + " is NOT same size as " + obj.toString();
        }
    }
}