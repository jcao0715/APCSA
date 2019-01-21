/**
 * Write a program that calculates your weight on each planet in the solar system.
 * @author Jing Cao
 * @version 01/15/19
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class PlanetWeight {

    public static double [] gravity()throws IOException {
		int iterate = 0;
		double[] gravities = new double[8];
		File fileName = new File("gravity.txt");
		Scanner inFile = new Scanner(fileName);
		while (inFile.hasNext()){
			gravities[iterate] = inFile.nextDouble();
			iterate++;
		}
		inFile.close();
		return gravities;
    }

    // Convert pounds to kilograms
    static double kiloPerPound = 2.2046;
    static int pound = 150;
    static double kilograms = pound / kiloPerPound;

    public static double[] pounds(double[]gravities, double[]weight) {
		for (int iterate = 0; iterate < 8; iterate++){
			weight[iterate] = kilograms * gravities[iterate];
		}
		return weight;
    }

    public static void print(double[] gravities, double[] weight, String[] planetNames) {
	    System.out.printf("%21s\n","My Weight on the Planets");
	    System.out.println("Planet	Gravity	 Weight(lbs)");
	    System.out.println("----------------------------");
	    for (int iterate = 0; iterate < 8; iterate ++){
	        System.out.printf(planetNames[iterate] + "	 %4.1f	%4.1f",gravities[iterate],weight[iterate]);	        System.out.println();
	    }
    }

    public static void main(String[] args) throws IOException {
        String [] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
	    double gravities[] = gravity();
	    double[] weight = new double[8];
	    weight = pounds(gravities, weight);
	    print(gravities, weight, planet);
    }

}
