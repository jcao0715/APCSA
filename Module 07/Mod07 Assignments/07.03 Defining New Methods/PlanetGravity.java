/**
 * Write a program to determine the surface gravity (g) on each planet in our solar system.  *
 * @author Jing Cao
 * @version 01/30/19
 */

import java.io.*;

public class PlanetGravity
{
    public static double[] resultGravity(double[] kg, double[] km)
    {
        double gravityConstant = 6.67E-11;
        double[] gravities = new double[8];

        for(int i = 0; i < gravities.length; i++)
        {
            gravities[i] = ((gravityConstant * kg[i]) / (Math.pow(km[i] / 2, 2)));
        }

        return gravities;
    }

    public static void printResults(String[] planet, double[] diameter, double[] kg, double[] grav)
    {
        System.out.printf("%28s\n", "Planetary Data");
        System.out.printf("%-12s %-17s %7s %11s\n", "Planet", "Diameter (km)", "Mass (kg)", "g (m / s^2)");
        System.out.printf("----------------------------------------------------\n");

        for(int i = 0; i < 8; i++)
        {
            System.out.printf("%-14s %-14.0f %5.2e %11.2f\n", planet[i], diameter[i], kg[i], grav[i]);
        }
    }

    public static void table(double[] grav) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new File("gravity.txt"));
        double[] resultGravity = grav;
        for(int i = 0; i < resultGravity.length; i++)
        {
            outFile.println(resultGravity[i]);
        }

        outFile.close();
    }

    public static void main(String[] args) throws IOException
    {
        String [] planet = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune",};
        double [] kg = {3.30E23,4.869E24,5.972E24,6.4219E23,1.900E27,5.68E26,8.683E25,1.0247E26};
        double [] km = {4880000,12103600,12756300,6794000,142984000,120536000,51118000,49532000};
        double [] diameter = {4880,12103.6,12756.3,6794,142984,120536,51118,49532};
        
        double [] grav = resultGravity(kg, km);
        printResults(planet, diameter, kg, grav);
        table(grav);
    }
}