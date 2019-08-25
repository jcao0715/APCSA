/**
 * Purpose: Create a program to calculate prime numbers within a range.
 * 
 * @author Jing Cao
 * @version 08/24/19
 */

import java.util.*;

public class PrimeTester {

	public static void main(String [] args) {

		Scanner in = new Scanner(System.in);

		//obtains user input
		System.out.println("Enter a lower limit.");
		int low = in.nextInt();
		System.out.println("Enter an upper limit.");
		int up = in.nextInt();

		//create new Prime object
		Prime obj = new Prime(low, up);
		obj.calcPrimes(low, up);

		//output results
		System.out.println("Primes within the given range: ");
		System.out.print(obj.showPrimes());

		System.out.println("Number of primes within the given range: ");
		System.out.println(obj.numPrimes());
	}
}