import java.util.Scanner;
/**
 * Purpose: Create a program to calculate grades and averages using the Scanner method.
 *
 * @author Jing Cao 
 * @version 11/21/18
 */
public class GradesV3
{
    public static void main(String[] args){
        //declare Scanner object
        Scanner in  = new Scanner(System.in);
        
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade    
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        String name;
        String subject;
        
        System.out.println("Enter your full name.");
        name = in.next();
        name += in.nextLine();
        
        System.out.println("Enter the subject name.");
        subject = in.next();
        subject += in.nextLine();
        
        numTests++;
        System.out.println("Enter your first test grade.");
        testGrade = in.nextInt();
        totalPoints += testGrade;
        average = (double)(totalPoints / numTests);
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints +  "   Average: " + average);
        System.out.println();
        
        numTests++;
        System.out.println("Enter your second test grade.");
        testGrade = in.nextInt();
        totalPoints += testGrade;
        average = (double)totalPoints / (double)numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints +  "  Average: " + average);
        System.out.println();
        
        numTests++;
        System.out.println("Enter your third test grade.");
        testGrade = in.nextInt();
        totalPoints += testGrade;
        average = (double)totalPoints / (double)numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints +  "  Average: " + average);
        System.out.println();
        
        numTests++;
        System.out.println("Enter your fourth test grade.");
        testGrade = in.nextInt();
        totalPoints += testGrade;
        average = (double)totalPoints / (double)numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints +  "  Average: " + average);
        
    }
}
