/**
 * Purpose: Use a recursive method to print the Fibonacci sequence.
 *
 * @author Jing Cao
 * @version 06/20/19
 */

import java.util.Scanner;

public class Fibonacci
{

	public int fibonacci(int n) 
	{
		if(n == 0)
		{
			return 0;
		}

		else if(n == 1)
		{
			return 1;
		}

		else
		{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
    
 	}

	public static void main(String [] args)
	{
		int x;
		Fibonacci fib = new Fibonacci();
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a non negative integer or -1 to exit the program.");
		x = in.nextInt();

		while(x != -1){

		System.out.println(fib.fibonacci(x));
		System.out.println("Enter a non negative integer or -1 to exit the program.");
		x = in.nextInt();

		}

		System.out.println("You have exited the program.");
	}
}