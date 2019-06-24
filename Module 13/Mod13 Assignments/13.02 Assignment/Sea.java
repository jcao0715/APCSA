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