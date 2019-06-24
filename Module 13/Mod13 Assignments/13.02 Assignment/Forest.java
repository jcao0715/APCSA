public class Forest extends Terrain
{
	private int trees;

	public Forest(int l, int w, int t)
	{
		super(l, w);
		trees = t;
	}

	public String getForestSize()
	{
		return "Forest " + getTerrainSize() + " and has " + trees + "trees.";
	}
}