/**
 * Annual Weather description: Create a program that displays the precipitaion and temperature from a city in Florida and calculate the annual precipitation and average temperature.
 * 
 * @author Jing Cao
 * @version 12/31/18
 *
 */
import java.util.Scanner;
public class AnnualWeatherV2
{
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Tallahassee";
        String state = "FL";
        String tempLabel = "";
        String precipLabel = "";
        double totalTempF = 0;
        double totalPrecipIn = 0;
        double avgTemp = 0;
        double totalPrecip = 0;


        //Declare arrays
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double [] temperature ={51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7};     //initialize with Fahrenheit values
        double [] precipitation ={5.4, 4.6, 6.5, 3.6, 5.0, 6.9, 8.0, 7.0, 5.0, 3.3, 3.9, 4.1};      //initialize with inch values

        System.out.println("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        String userTempScale = in.next();
        System.out.println("Choose the precipitation scale (i = inches, c = centimeters): ");
        String userPrecipScale = in.next();


        //Processing - calculate average temperature and total precipitation
        for( int index = 0; index < temperature.length; index++)
        {
            totalTempF += temperature[index];
        }

            double avgTempF = totalTempF / temperature.length;

        for (int index = 0; index < precipitation.length; index++)
        {
            totalPrecipIn += precipitation[index];
        }


        //Processing - determine which scales to display according to user input
        if(userTempScale.equalsIgnoreCase("F"))
        {
            avgTemp = avgTempF;
            tempLabel = "F";

            if(userPrecipScale.equalsIgnoreCase("i"))
            {
                totalPrecip = totalPrecipIn;
                precipLabel = "in.";
            }

            else if(userPrecipScale.equalsIgnoreCase("c"))
            {
                totalPrecip = totalPrecipIn * 2.54;
                precipLabel = "cm.";
            }

        }

        else if(userTempScale.equalsIgnoreCase("C"))
        {
            avgTemp = (avgTempF - 32) * (9 / 5);
            tempLabel = "C";

            if(userPrecipScale.equalsIgnoreCase("i"))
            {
                totalPrecip = totalPrecipIn;
                precipLabel = "in.";
            }

            else if(userPrecipScale.equalsIgnoreCase("c"))
            {
                totalPrecip = totalPrecipIn * 2.54;
                precipLabel = "cm.";
            }

        }


        //Output: display table of weather data including average and total
        System.out.println();
        System.out.printf("%35s\n", "Weather Data");
        System.out.printf("%45s\n", "Location: " + city +", " + state);
        System.out.printf("%8s%18s%24s\n", "Month", "Temperature (" +  tempLabel + ")", "Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");

        for( int index = 0; index < month.length; index++)
        {
        System.out.printf("%8s%13s%20s\n", month[index], temperature[index], precipitation[index]);
        }

        System.out.println("***************************************************");
        System.out.println();
        System.out.printf("%8.13s%18.12s\n", "Average: " + avgTemp, "Total: " + totalPrecip);



        // //SECOND LOCATION

        // //Declare and initialize variables
        // Scanner in = new Scanner(System.in);
        // String city = "Daytona Beach";
        // String state = "FL";
        // String tempLabel = "";
        // String precipLabel = "";
        // double totalTempF = 0;
        // double totalPrecipIn = 0;
        // double avgTemp = 0;
        // double totalPrecip = 0;


        // //Declare arrays
        // String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        // double [] temperature ={58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8};     //initialize with Fahrenheit values
        // double [] precipitation ={3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};      //initialize with inch values


        // System.out.println("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        // String userTempScale = in.next();
        // System.out.println("Choose the precipitation scale (i = inches, c = centimeters): ");
        // String userPrecipScale = in.next();


        // //Processing - calculate average temperature and total precipitation
        // for( int index = 0; index < temperature.length; index++)
        // {
        //     totalTempF += temperature[index];
        // }

        //     double avgTempF = totalTempF / temperature.length;

        // for (int index = 0; index < precipitation.length; index++)
        // {
        //     totalPrecipIn += precipitation[index];
        // }


        // //Processing - determine which scales to display according to user input
        // if(userTempScale.equalsIgnoreCase("F"))
        // {
        //     avgTemp = avgTempF;
        //     tempLabel = "F";

        //     if(userPrecipScale.equalsIgnoreCase("i"))
        //     {
        //         totalPrecip = totalPrecipIn;
        //         precipLabel = "in.";
        //     }

        //     else if(userPrecipScale.equalsIgnoreCase("c"))
        //     {
        //         totalPrecip = totalPrecipIn * 2.54;
        //         precipLabel = "cm.";
        //     }

        // }

        // else if(userTempScale.equalsIgnoreCase("C"))
        // {
        //     avgTemp = (avgTempF - 32) * (9 / 5);
        //     tempLabel = "C";

        //     if(userPrecipScale.equalsIgnoreCase("i"))
        //     {
        //         totalPrecip = totalPrecipIn;
        //         precipLabel = "in.";
        //     }

        //     else if(userPrecipScale.equalsIgnoreCase("c"))
        //     {
        //         totalPrecip = totalPrecipIn * 2.54;
        //         precipLabel = "cm.";
        //     }

        // }


        // //Output: display table of weather data including average and total
        // System.out.println();
        // System.out.printf("%35s\n", "Weather Data");
        // System.out.printf("%45s\n", "Location: " + city +", " + state);
        // System.out.printf("%8s%18s%24s\n", "Month", "Temperature (" +  tempLabel + ")", "Precipitation (" + precipLabel + ")");
        // System.out.println();
        // System.out.println("***************************************************");

        // for( int index = 0; index < month.length; index++)
        // {
        // System.out.printf("%8s%13s%20s\n", month[index], temperature[index], precipitation[index]);
        // }

        // System.out.println("***************************************************");
        // System.out.println();
        // System.out.printf("%8.13s%18.12s\n", "Average: " + avgTemp, "Total: " + totalPrecip);


    }
}