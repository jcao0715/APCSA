/**
 * This class defines a Square object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Jing Cao
 * @version 06/26/19
 */

public class Square4 extends Rectangle4
{
	public Square4(int l, int w)
	{
		super(l, w);
	}

	public String toString()
    {
        return "Square - " + getLength() + " X " + getWidth();
    }
}