/*
 *
 * The purpose of this program is to demonstrate how to write information to
 * a text file on the hard disk.
 *
 * @author Jing Cao
 * @version 12/17/2018
 */

import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class test
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		File filename = new File("counter.txt");
		// File filename2 = new File("count.txt");
		PrintWriter outFile = new PrintWriter(filename);
		Scanner inFile = new Scanner(filename);
		// Scanner inFile2 = new Scanner(filename2);


		// int token = inFile.nextInt();


		outFile.println("5");
		outFile.println("5");
		outFile.println("5");

		System.out.println("Reading File");


		while (inFile.hasNextLine()){
			int i = inFile.nextInt();
			System.out.println(i);
		}
		outFile.close();
		inFile.close();


		// System.out.println("Reading File2");

		// while (inFile2.hasNextLine()){
		// 	int i = inFile2.nextInt();
		// 	System.out.println(i);
		// }

		// inFile2.close();
	}
}