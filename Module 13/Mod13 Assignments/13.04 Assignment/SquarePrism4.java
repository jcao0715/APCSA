/**
 * This class defines a Square Prism object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Jing Cao
 * @version 06/26/19
 */

public class SquarePrism4 extends Box4
{
	public SquarePrism4(int l, int w, int h)
	{
		super(l, w, h);
	}

	// String to display when object is printed.
    public String toString()
    {
        return "Square Prism - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}