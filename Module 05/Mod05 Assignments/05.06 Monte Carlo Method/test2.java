/*
 *
 * The purpose of this program is to demonstrate how to write information to
 * a text file on the hard disk.
 *
 * @author Jing Cao
 * @version 12/17/2018
 */

import java.util.*;
import java.io.*;

public class test2
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		PrintWriter outFile = new PrintWriter(new File("count.txt"));
		Scanner inFile =  new Scanner(new File("count.txt"));
		Random rand = new Random();
		int squirrelNum;
		int foxSquirrel = 0;
		int squirrelsSeen = 0;
		int trials = 0;

		System.out.println("Welcome to the Fox Squirrel Simulator\n");
		System.out.println("How many trials should be simulated?");
		System.out.println("Enter a value greater than 1000: ");
		trials = in.nextInt();

		// while(trials <= 1000)
		// {
		// 	System.out.println("Please try again. Enter a value greater than 1000: ");
		// 	trials = in.nextInt();
		// }

		for(int i = 0; i <= trials; i ++)
		{
			squirrelNum = rand.nextInt(10);
			outFile.println(squirrelNum);

			while(inFile.hasNextInt())
			{
				squirrelNum = rand.nextInt(10);
				outFile.println(squirrelNum);
				int token = inFile.nextInt();

				while(token != 0)
				{
					squirrelNum = rand.nextInt();
					outFile.println(squirrelNum);
					squirrelsSeen ++;
				}

				if(token == 0)
				{
					foxSquirrel ++;
					squirrelsSeen ++;
				}
				
				System.out.println("squirrelsSeen: " + squirrelsSeen);
				System.out.println("foxSquirrel: " + foxSquirrel);

			}

			outFile.close();
			System.out.println("squirrelsSeen: " + squirrelsSeen);
			System.out.println("foxSquirrel: " + foxSquirrel);
		}

	
		inFile.close();
		System.out.println("\nsimulating trials now... one moment please...\n");
		System.out.println("The results!");
		System.out.println("The average number of squirrels until spotting a Fox Squirrel at the city park is: " + (((double)foxSquirrel / squirrelsSeen) * 100));

		
	}
}