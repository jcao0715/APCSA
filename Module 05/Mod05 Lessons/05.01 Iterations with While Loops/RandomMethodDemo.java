import java.util.Scanner;

/**
 * The purpose of this program is to illustrate the use of the
 * Math class ranomd() method.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
public class RandomMethodDemo
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please input a number: ");
        int input = in.nextInt();
        
        double randomNumber;
        int counter = 1;
        
        while(counter <= input)
        {
            randomNumber = Math.random();
            System.out.println((input - counter + 1) + ":  " + randomNumber);
            counter ++;
        }//end of while loop
    }//end of main method
}//end of class


/*
 *

if( randomNumber > 0.4 && random number < 0.6 )
{

}
 */