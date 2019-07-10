/*
* Purpose: Write a program to encode or decode a message using a Caesar Shift.
*
* Name: Jing Cao
* Date: 7/10/19
*/

import java.util.*;

public class CaesarTester {

	public static void main(String[] args) {

		final String[] ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            					   "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

		Scanner in = new Scanner(System.in);
		boolean quit = true;
		String choice = "";

		System.out.println("Enter a shift value from 0 to 25: ");
		int shiftKeyVal = in.nextInt();
		if(shiftKeyVal < 0 || shiftKeyVal > 25) {

			System.out.println("This is not a valid number!");

		}

		while(!quit) {
			System.out.println("--------------------------------");
			System.out.println("Enter \"e\" to encrypt.");
			System.out.println("Enter \"d\" to decrypt.");
			System.out.println("Enter \"q\" to quit.");
			System.out.println("--------------------------------");

			choice = in.next();

			if(choice.equalsIgnoreCase("e")) {
				System.out.println("Alphabet: " + ALPHABET);
				System.out.println("Cipher alphabet: ");
				System.out.print(Encryption.createCipher(shiftKeyVal) + "\n");

				System.out.println("Enter a plaintext message.");

				String message = in.next() + in.nextLine();
				System.out.println("Encrypted message: " + Encryption.encrypt(Encryption.createCipher(shiftKeyVal), message));
			}

			else if(choice.equalsIgnoreCase("d")) {
				System.out.println("Alphabet: " + ALPHABET);
				System.out.println("Cipher alphabet: ");
				System.out.print(Decryption.createCipher(shiftKeyVal) + "\n");

				System.out.println("Enter a plaintext message.");

				String message = in.next() + in.nextLine();
				System.out.println("Decrypted message: " + Decryption.decrypt(Decryption.createCipher(shiftKeyVal), message));
			}

			else if(choice.equalsIgnoreCase("q")) {
				quit = false;
			}
		}

	}
}