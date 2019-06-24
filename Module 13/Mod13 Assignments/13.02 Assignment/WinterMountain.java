public class WinterMountain extends Mountain
{
	private double temperature;

	public WinterMountain(int l, int w, int m, double t)
	{
		super(l, w, m);
		temperature = t;
	}

	public String getWinterMountainSize()
	{
		return "Winter " + getMountainSize() + " and temperature " + temperature + " degrees."; 
	}
}