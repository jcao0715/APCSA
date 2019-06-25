/**
 * This class defines a basic Sea Terrain.
 *
 * @author Jing Cao
 * @version 6/25/19
 */

public class Sea extends Ocean
{
	private int plants;

	public Sea(int l, int w, int f, int p)
	{
		super(l, w, f);
		plants = p;
	}

	public String getSeaSize()
	{
		return "Sea " + getOceanSize() + " and " + plants + "plants.";
	}
}