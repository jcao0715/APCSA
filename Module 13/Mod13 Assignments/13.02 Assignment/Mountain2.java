/**
 * This class defines a basic Mountain Terrain.
 *
 * @author Jing Cao
 * @version 6/25/19
 */

public class Mountain extends Terrain
{
	private int mountains;

	public Mountain(int l, int w, int m)
	{
		super(l, w);
		mountains = m;
	}

	public String getMountainSize()
	{
		return "Mountain " + getTerrainSize() + "and has " + mountains + "mountains.";
	}
}