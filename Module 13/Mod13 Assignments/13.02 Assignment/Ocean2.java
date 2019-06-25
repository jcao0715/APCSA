/**
 * This class defines a basic Ocean Terrain.
 *
 * @author Jing Cao
 * @version 6/25/19
 */

public class Ocean extends Terrain
{
	private int fish;

	public Ocean(int l, int w, int f)
	{
		super(l, w);
		fish = f;
	}

	public String getOceanSize()
	{
		return "Ocean " + getTerrainSize() + " and has " + fish + " fish.";
	}
}