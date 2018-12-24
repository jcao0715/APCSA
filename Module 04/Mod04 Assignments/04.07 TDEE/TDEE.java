import java.util.Scanner;
/**
 * Purpose: Create a program that calulates the total daily energy expenditure.
 *
 * @author Jing Cao
 * @version 12/02/18
 */
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = in.next();
        name += in.nextLine();
        System.out.print("Please enter your BMR: ");
        String stringBMR = in.next();
        double bMR = Double.parseDouble(stringBMR);
        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next();
        String upperCaseGender = gender.toUpperCase();
        
        System.out.println();
        System.out.println("Select Your Activity Level)");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Rising Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        System.out.println();
        System.out.print("Enter the letter corresponding to your activity level: ");
        String choice = in.next();
        
        double activityFactor = 0;
        if(choice.equalsIgnoreCase("A")){
         activityFactor = 1.0;
        }
        
        else if(choice.equalsIgnoreCase("B")){
          activityFactor = 1.3;
        }
        
        else if(choice.equalsIgnoreCase("C") && gender.equalsIgnoreCase("F")){
            activityFactor = 1.5;
        }
        
        else if(choice.equalsIgnoreCase("C") && gender.equalsIgnoreCase("M")){
            activityFactor = 1.6;
        }
        
        else if(choice.equalsIgnoreCase("D") && gender.equalsIgnoreCase("F")){
            activityFactor = 1.6;
        }
        
        else if(choice.equalsIgnoreCase("D") && gender.equalsIgnoreCase("M")){
            activityFactor = 1.7;
        }
            
        else if(choice.equalsIgnoreCase("E") && gender.equalsIgnoreCase("F")){
            activityFactor = 1.9;
        }
            
        else if(choice.equalsIgnoreCase("E") && gender.equalsIgnoreCase("M")){
            activityFactor = 2.1;
        }
            
        else if(choice.equalsIgnoreCase("F") && gender.equalsIgnoreCase("F")){
            activityFactor = 2.2;
        }
            
        else if(choice.equalsIgnoreCase("F") && gender.equalsIgnoreCase("M")){
            activityFactor = 2.4;
        }
            
        else{
            System.out.println("You have made an error!");
        }
        
        double tDEE = bMR * activityFactor;
        System.out.println("\n\n");
        System.out.println("Your results:");
        System.out.println("Name: " + name + "\t\t\t Gender: " + upperCaseGender);
        System.out.println("BMR: " + bMR + " calories"+ "\t\t Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories");
        
    }
}
