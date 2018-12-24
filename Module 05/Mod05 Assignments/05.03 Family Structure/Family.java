/**
 * The purpose of this program is to read data from
 * an input file.
 *
 * @author Jing Cao
 * @version 12/15/18
 */

import java.util.*;
import java.io.*;

public class Family
{
	public static void main(String[] args) throws IOException
	{
		//initialize variables
		int totalFamilies = 0;
		int numBB = 0;
		int numBG = 0;
		int numGB = 0;
		int numGG = 0;

		File fileName = new File("maleFemaleInFamily.txt");
		Scanner inFile = new Scanner(fileName);

		//while loop counts each occurence
		while(inFile.hasNext())
		{
			String token = inFile.next();
			
			if(token.equals("BB"))
			{
				numBB++;
				totalFamilies ++;
			}

			else if(token.equals("BG"))
			{
				numBG++;
				totalFamilies ++;
			}

			else if(token.equals("GB"))
			{
				numGB++;
				totalFamilies ++;
			}

			else if(token.equals("GG"))
			{
				numGG++;
				totalFamilies ++;
			}

		}

		int total = totalFamilies;
		int totalGB = numBG + numGB;

		System.out.println("Composition statistics for families with two children. \n");
		System.out.println("Total number of families: " + total + "\n");
		System.out.println("Number of families with \n");
		System.out.println("		  2 boys: " + numBB + "\t represents " + (((double)numBB / total) * 100) + "%");
		System.out.println("		 2 girls: " + numGG + "\t represents " + (((double)numGG / total) * 100) + "%");
		System.out.println("        1 boy and 1 girl: " + totalGB + "\t represents " + (((double)totalGB / total)) * 100 + "%");
	}
}