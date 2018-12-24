import java.util.Scanner;

/**
 * Purpose: Create a program that calculates BMI.
 *
 * @author Jing Cao
 * @version 
 */
public class BMI
{
    public static void main(String [ ] args)
    {
     //declare Scanner
     Scanner in = new Scanner(System.in);
     
     //input user info
     System.out.println("Enter your first and last name (first last): ");
     String name = in.next();
     name += in.nextLine();
     
     System.out.println("Enter your weight in pounds (e.g. 175): ");
     String weightLbsString = in.next();
     
     System.out.println("Enter your height in feet and inches (e.g. 5 10): ");
     String heightFtInString = in.next();
     heightFtInString += in.nextLine();
     
     //converting feet and inches into meters
     int spaceIndex = heightFtInString.indexOf(" ");
     String heightFt = heightFtInString.substring(0 , spaceIndex);
     String heightIn = heightFtInString.substring(spaceIndex + 1);
     double heightFt1 = Double.parseDouble(heightFt);
     double heightIn2 = Double.parseDouble(heightIn);
     double totalIn = heightFt1 * 12 + heightIn2;
     double heightM = totalIn * 0.0254;
     
     //converting pounds into kilograms
     double weightLbs = Double.parseDouble(weightLbsString);
     double weightKg = weightLbs * 0.453592;
     
     //calculate BMI
     double bMI = weightKg / (heightM * heightM);
     
     //print info
     System.out.println("Body Mass Index Calculator");
     System.out.println("=============================");
     System.out.println("Name: " + name);
     System.out.println("Height (m): " + heightM);
     System.out.println("Weight (kg): " + weightKg);
     System.out.println("BMI: " + bMI);
     
     //decide category
     if(bMI < 18.5)
        System.out.println("Category: underweight");
        
     else if(bMI < 24.9)
        System.out.println("Category: normal");
        
     else if(bMI < 29.9)
        System.out.println("Category: overweight");
     else
        System.out.println("Category: obese");
        
     
    }    
}
