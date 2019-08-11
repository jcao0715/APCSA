
/**
 * This class defines a Circle object.
 *
 * @author Jing Cao
 * @version 08/11/19
 */

public class Circle
{
    // instance variables
    private int x;
    private int y;
    private int radius;

    // Constructor for objects of class Circle
    public Circle2(int x, int y, int radius)
    {
        // initialize instance variables
        this.x = p_x;
        this.y = p_y;
        this.radius = r;
    }

    public int getRadius()
    {
        return this.radius;
    }

    // Concatenates a String to show the center x, y point of the circle
    public String getCenter()
    {
         return "center is at (" + this.x + ", " + this.y + ")";
    }

    public String getName()
    {
        return "Circle2";
    }
}