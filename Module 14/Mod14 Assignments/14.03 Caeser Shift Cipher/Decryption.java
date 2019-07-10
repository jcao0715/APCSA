/*
* Purpose: Write a program to encode or decode a message using a Caesar Shift.
*
* Name: Jing Cao
* Date: 7/10/19
*/

public class Decryption { 

	private static final String[] ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            					  			  "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

	public static String[] createCipher(int shiftVal) {

		String[] cipher = new String[ 26 ];

		for(int i = 0; i < 26; i++) {

			if(i + shiftVal >= 0 && i + shiftVal <= 25) {

				cipher[i] = ALPHABET[i + shiftVal];
			}

			else {
				cipher[i] = ALPHABET[i + shiftVal - 26];
			}
		}

		return cipher;
	}

	public static String decrypt(String[] cipher, String message) {

		String decrypted = "";

		for(int i = 0; i < message.length(); i++) {

			if(message.charAt(i) == ' ') {
				decrypted += ' ';
			}

			else {
				for(int k = 0; k < 26; k++) {
					if(message.substring(i, i + 1).equals(ALPHABET[k])) {
						decrypted += cipher[k];
					}
				}
			}
		}

		return decrypted;
	}
}