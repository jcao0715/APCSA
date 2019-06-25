/**
 * This class defines a basic Winter Mountain Terrain.
 *
 * @author Jing Cao
 * @version 6/25/19
 */

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