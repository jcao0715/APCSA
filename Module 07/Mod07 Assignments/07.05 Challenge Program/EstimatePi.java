/**
 * Purpose: Write a program to calculate the value of pi by simulating throwing darts at a dart board.
 *
 * @author Jing Cao
 * @version 05/25/19
 */

import java.util.Scanner;

public class EstimatePi
{  
    double x, y, radius = 1.0;
    double numOfHits = 0, pi = 0, average = 0;
    int dartThrows = 0, numOfTrials = 0;
    
    public static int hits (double x, double y, int numTrials)
    {
        for(int n = 1; n < numTrials; n++)
        {
            x = Math.random();
            y = Math.random();
            
            if((Math.pow(x, 2) + Math.pow(y, 2)) <= (Math.pow(radius, 2)))
            {
                numOfHits++;
            }
        }
        
        return numOfHits;

    }
    
    public static double calculatePi (double numOfHits, double dartThrows)
    {
        double pi = (4 * ((double)(numOfHits)) / dartThrows);
        
        return pi;
    }
    
    public static void main (String[] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many darts per trial?");
        dartThrows = in.nextInt();
        
        System.out.println();
        
        System.out.print("How many trials?");
        numOfTrials = in.nextInt();
        
        double total = 0.0;
        
        
        
        for(int n = 0; n < numOfTrials; n++)
        {
            int hits = hits(x, y, dartThrows);
            double approxPi = calculatePi(hits, dartThrows);
            total += approxPi;
            
            System.out.printf("Trial " + "[ " + (n+1) + " ]" + ": pi = %12f\n", approxPi);
        }
            
            double average = (total / numOfTrials);
            System.out.printf("Estimate of Pi: %1.5f", average);
        
        
    }
    
}
