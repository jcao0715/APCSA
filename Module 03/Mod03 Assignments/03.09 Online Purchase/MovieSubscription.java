import java.util.Scanner;
/**
 * Purpose: Use previously learned knowledge to create a program to stimulate an online purchase.
 *
 * @author Jing Cao
 * @version 11/21/18
 */
public class MovieSubscription
{
   public static void main(String[ ] args)
   {
       Scanner in = new Scanner(System.in);
       
       System.out.println("Greetings.");
       
       //input name
       System.out.print("Please enter your first and last name: ");
       String name = in.next();
       name += in.nextLine();
       
       //input date
       System.out.print("Enter today's date (mm/dd/yyyy): ");
       String date = in.next();
       
       //input subscription service
       System.out.print("Which movie subscription service would you like to purchase? ");
       String item = in.next();
       item += in.nextLine();
       
       //input how many months purchased
       System.out.print("How many months would you like to purchase it for? ");
       String months = in.next();
       
       //input monthly price
       System.out.print("What is the price per month? $");
       String price = in.next();
       
       //input debit card info
       System.out.print("Enter your debit card number (#####-###-####): ");
       String debitCardNumber = in.next();
       
       System.out.print("Enter your PIN (####): ");
       String pinNumber = in.next();
       
       System.out.println();
       System.out.println("*******************************************************************");
       System.out.println("*******************************************************************");
       System.out.println("Your e-Receipt");
       System.out.println();
       
       //print modified date
       String newDate = date.replace("/" , "-");
       System.out.println(newDate);
       
       //print modified name
       int spaceIndex = name.indexOf(" ");
       String firstName = name.substring(0 , spaceIndex);
       String lastName = name.substring(spaceIndex + 1);
       String newName = firstName.substring(0 , 1) + ". " + lastName;
       System.out.println(newName);
       
       //print account info
       String accountNumber = "#####-###-" + debitCardNumber.substring(10);
       System.out.println("Account: " + accountNumber);
       
       //print item purchased
       System.out.println("Subscription service: " + item);
       System.out.println("Months: " + months);
       System.out.println("Monthly price: " + price);
       System.out.println();
       
       //print total price
       double newMonths = Double.parseDouble(months);
       double newPrice = Double.parseDouble(price);
       double totalPrice = newMonths * newPrice;
       System.out.println("$" + totalPrice + " will debted from your account.");
       System.out.println();
       
       System.out.println("Thank you for your purchase.");
       System.out.println("*******************************************************************");
       System.out.println("*******************************************************************");
   }
}
