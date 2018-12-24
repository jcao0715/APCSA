
/**
 * Purpose: Replace all integer values with integer variables.
 *
 * @author Jing Cao
 * @version September 22, 2018
 */
public class CalculationsV5
{
    public static void main(String[] args)
    {
        //Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        int iNum4 = 22;
        
        //Declare double variables
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 10.0;
        
        //Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " + " + dNum3 + " = " + (dNum1 + dNum2 + dNum3));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum1 + " - " + iNum2 + " = " + (iNum1 - iNum2));
        System.out.println("3.14 - 10.0 = " + (3.14 - 10.0));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));
        System.out.println("3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println("43.21 / 10.0 = " + (43.21 / 10.0));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println("10.0 % 3.14 = " + (10.0 % 3.14));
        System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println(iNum3 + " + " + iNum4 + " = " + (iNum3 + iNum4));
        System.out.println(iNum1 + " - " + iNum3 + " = " + (iNum1 - iNum3));
        System.out.println(iNum4 + " % " + iNum3 + " = " + (iNum4 % iNum3));
        
        //2.04 Additional double Equations
        
    }
}
