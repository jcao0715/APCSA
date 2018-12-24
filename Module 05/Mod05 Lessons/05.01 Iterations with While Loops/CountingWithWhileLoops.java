/**
 * The purpose of this program is to illustrate the use of the
 * while loop as a counter.
 *
 * @author Jing Cao 
 * @version 12/10/18
 */
public class CountingWithWhileLoops
{
    public static void main(String [] args)
    {
        int counter = 0;
        int theTerminator = 10000;          //initialize the terminating value

        while(counter < theTerminator)     //test the terminating condition
        {
            System.out.println("counter = " + counter);
            
        }//end of while loop

    }//end of main method
}//end of class