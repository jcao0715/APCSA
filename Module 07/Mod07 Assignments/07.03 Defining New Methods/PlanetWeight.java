import java.util.*;
import java.io.*;

public class PlanetWeight
{
	public static double[] gravity() throws IOException
	{
		int i = 0;
		double[] gravities = new double[8];
		Scanner inFile = new Scanner(new File("gravity.txt"));

		while(inFile.hasNext())
		{
			gravities[i] = inFile.nextDouble();
			i++;
		}

		inFile.close();
		return gravities;
	}

	public static double[] pounds(double[] gravities, double[] weight)
	{
		double kgPerLbs = 2.2046;
		int lbs = 150;
		double kg = lbs / kgPerLbs;

		for(int i = 0; i < 8; i++)
		{
			weight[i] = kg + gravities[i];
		}

		return weight;
	}

	public static void print(double[] gravities, double[] weight, String[] planets)
	{
		System.out.printf("%20s\n", "My Weight on the Planets");
		System.out.println("Planet          Gravity          Weight (lbs)");
		System.out.println("---------------------------------------------");

		for(int i = 0; i < 8; i++)
		{
			System.out.printf("%-10s %10.1f %18.1f\n", planet[i], gravities[i], weight[i]);
		}
	}

	public static void main(String[] args) throws IOException
	{
		String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		double gravities[] = gravity();
		double[] weight = new double[8];
		weight = pounds(gravities, weight);
		print(gravities, weight, planets);
	}
}