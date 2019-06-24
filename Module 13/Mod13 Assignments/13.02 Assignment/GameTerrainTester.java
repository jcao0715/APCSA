public class GameTerrainTester
{
	public static void main(String [] args)
	{
		Terrain obj1 = new Terrain(150, 200);
		Forest obj2 = new Forest(400, 400, 180);
		Mountain obj3 = new Mountain(600, 200, 12);
		WinterMountain obj4 = new WinterMountain(500, 500, 30, 12.34);
		Ocean obj5 = new Ocean(500, 500, 1000);
		Sea obj6 = new Sea(500, 500, 1000, 1500);

		System.out.println(obj1.getTerrainSize());
		System.out.println(obj2.getForestSize());
		System.out.println(obj3.getMountainSize());
		System.out.println(obj4.getWinterMountainSize());
		System.out.println(obj5.getOceanSize());
		System.out.println(obj6.getSeaSize());

	}
}