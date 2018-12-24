
/**
 * Purpose: Create a program to calculate grades and averages using concatenation and casting.
 *
 * @author Jing Cao 
 * @version 10/13/18
 */
public class GradesV2
{
    public static void main(String[] args){
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade    
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        numTests++;
        testGrade = 95;
        totalPoints += 95;
        average = (double)(totalPoints / numTests);
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints +  "   Average: " + average);
        
        numTests++;
        testGrade = 73;
        totalPoints += 73;
        average = (double)totalPoints / (double)numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints +  "  Average: " + average);
        
        numTests++;
        testGrade = 91;
        totalPoints += 91;
        average = (double)totalPoints / (double)numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints +  "  Average: " + average);
        
        numTests++;
        testGrade = 82;
        totalPoints += 82;
        average = (double)totalPoints / (double)numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints +  "  Average: " + average);
        
    }
}
