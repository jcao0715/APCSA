/*
 *
 * Purpose: Create a program that generates random passcodes.
 *
 * @author Jing Cao
 * @version 12/20/2018
 */

import java.util.*;

 public class PasscodeGenerator
 {
 		public static void main(String [] args)
 		{
 			Scanner in = new Scanner(System.in);
 			int selection;
 			int length;

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

 			
 		}
 }