/*
 *
 * Purpose: Create a program that generates random passcodes.
 *
 * @author Jing Cao
 * @version 12/20/2018
 */

import java.util.*;  
import java.io.*;

 public class PasscodeGenerator
 {
 		public static void main(String [] args) throws IOException
 		{
 			Scanner in = new Scanner(System.in);
 			int selection = 0;
 			int length;
 			Random rand = new Random();
 			File filename = new File("passwords.txt");
 			PrintWriter outFile = new PrintWriter(filename);
 			Scanner inFile = new Scanner(filename);
 			String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 			String lowercase = "abcdefghijklmnopqrstuvwxyz";
 			String numbers = "1234567890";
 			String password1 = "";
 			String password2 = "";
 			String password3 = "";
 			String password4 = "";

 			System.out.println("\t\t\tPassword Generator");
 			System.out.println("*************************************************************");
 			System.out.println("*	[1] Lowercase letters                               *");
 			System.out.println("*	[2] Lowercase and uppercase letters	            *");
 			System.out.println("*	[3] Lowercase letters and numbers                   *");
 			System.out.println("*	[4] Lowercase, uppercase, and numbers               *");
 			System.out.println("*	[5] Quit                                            *");
 			System.out.println("*************************************************************");

 			System.out.print("Enter selection (1-5): ");
 			selection = in.nextInt();


			while(selection != 5) 			
			{
	 			while(selection < 1 || selection > 5)
	 			{
	 				System.out.println("Invalid option. Please try again.");
	 				System.out.println("Enter selection (1-5): ");
	 				selection = in.nextInt();
	 			}

	 			System.out.println("Password length (more than 6 characters): ");
	 			length = in.nextInt();
	 			while(length <= 6)
	 			{
	 				System.out.println("Password length too short. Please try again.");
	 				System.out.println("Password length (more than 6 characters: ");
	 				length = in.nextInt();
	 			}
	 			
		 			if(selection == 1)
		 			{
		 				for(int i = 0; i < length; i ++)
		 				{
		 					password1 += lowercase.charAt(rand.nextInt(lowercase.length()));
		 				}
		 				outFile.println(password1);
		 			}

		 			else if(selection == 2)
		 			{
		 				for (int i = 0; i < length; i ++)
		 				{
		 					int loopSelect = rand.nextInt(2);

		 					if(loopSelect == 0)
		 					{
		 						password2 += lowercase.charAt(rand.nextInt(lowercase.length()));
		 					}

		 					else if(loopSelect == 1)
		 					{
		 						password2 += uppercase.charAt(rand.nextInt(uppercase.length()));
		 					}
		 				}
		 				outFile.println(password2);
		 			}

		 			else if(selection == 3)
		 			{
		 				for(int i = 0; i < length; i ++)
		 				{
		 					int loopSelect = rand.nextInt(2);

		 					if(loopSelect == 0)
		 					{
		 						password3 += lowercase.charAt(rand.nextInt(lowercase.length()));
		 					}

		 					else if(loopSelect == 1)
		 					{
		 						password3 += numbers.charAt(rand.nextInt(numbers.length()));
		 					}
		 				}
		 				outFile.println(password3);
		 			}

		 			else if(selection == 4)
		 			{
		 				for(int i = 0; i < length; i ++)
		 				{
		 					int loopSelect = rand.nextInt(3);

		 					if(loopSelect == 0)
		 					{
		 						password4 += lowercase.charAt(rand.nextInt(lowercase.length()));
		 					}

		 					else if(loopSelect == 1)
		 					{
		 						password4 += uppercase.charAt(rand.nextInt(uppercase.length()));
		 					}

		 					else if(loopSelect == 2)
		 					{
		 						password4 += numbers.charAt(rand.nextInt(numbers.length()));
		 					}
		 				}
		 				outFile.println(password4);
		 			}

		 			System.out.print("Enter selection (1-5): ");
 					selection = in.nextInt();

	 			}
				
				outFile.close();

				System.out.println("Thank you for using the Password Generator.\n");
				System.out.println("Passwords generated:");

				while(inFile.hasNextLine())
				{
					String token = inFile.nextLine();
					System.out.println("Password: " + token);
				}

				inFile.close();

				System.out.println();
				System.out.println("Thank you for using the Password Generator.");
 			}	

 }