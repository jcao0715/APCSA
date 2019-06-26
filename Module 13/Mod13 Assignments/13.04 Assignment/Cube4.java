/**
 * This class defines a Cube object by extending
 * Box.
 * The toString method has been added.
 *
 * @author Jing Cao
 * @version 06/26/19
 */

public class Cube4 extends Box4
{
	public Cube4(int l, int w, int h)
	{
		super(l, w, h);
	}

	public String toString()
	{
		return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
	}

}