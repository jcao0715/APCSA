/**
 * Purpose: Create a program to calculate prime numbers within a range.
 * 
 * @author Jing Cao
 * @version 08/24/19
 */
import java.util.*;

public class Prime {

	//declare variables
	private int lowerLimit;
	private int upperLimit;
	private ArrayList<Integer> primes = new ArrayList<Integer>();

	//constructor
	public Prime (int lowerLimit, int upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

	//calculate primes within the range
	public void calcPrimes(int lower, int upper) {
		boolean isPrime = true;

		for(int n = lower; n <= upper; n++) {
			if (n <= 1) {
				isPrime = false;
			}
	
			if(n == 2) {
				isPrime = true;
			}
	        for (int i = 2; i < n; i++) {
	            if (n % i == 0) {
	            		isPrime = false;
	            }
	                
	        }
	        
	        if(isPrime) {
	        		primes.add(n);
	        }

		}
	}

	//outputs primes found
	public String showPrimes() {
		String s = "";
		
		for(int i : primes) {
			s += i + " ";
		}
		
		return s;
	}

	//returns number of primes found
	public int numPrimes() {
		return primes.size();
	}

}