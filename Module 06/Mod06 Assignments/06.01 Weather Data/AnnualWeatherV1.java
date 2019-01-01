/**
 * Annual Weather description:
 * 
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
import java.util.Scanner;
public class AnnualWeatherV1
{
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Apalachicola";
        String state = "FL";
        double totalTemp = 0;
        double totalPrecip = 0;


        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double [] temperature ={52.7 ,55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2};     //initialize with Fahrenheit values
        double [] precipitation ={4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5};      //initialize with inch values
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
    
    
        //Processing - calculate average temperature and total precipitation
        for( int index = 0; index < temperature.length; index++)
        {
            totalTemp += temperature[index];
        }

            double avgTemp = totalTemp / temperature.length;

        for (int index = 0; index < precipitation.length; index++)
        {
            totalPrecip += precipitation[index];
        }
    
    
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");

        for( int index = 0; index < month.length; index++)
        {
        System.out.println(month[index] + "       " + temperature[index] + "                " + precipitation[index]);
        }

        System.out.println("***************************************************");
        System.out.println();
        System.out.println("Average: " + avgTemp + "    Total: " + totalPrecip);


        // //Second location

        // //Declare and initialize variables
        // Scanner in = new Scanner(System.in);
        // String city = "Daytona Beach";
        // String state = "FL";
        // double totalTemp = 0;
        // double totalPrecip = 0;


        // String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        // double [] temperature ={58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8};     //initialize with Fahrenheit values
        // double [] precipitation ={3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};      //initialize with inch values
    
        // String tempLabel = "F";    //initialize to F
        // String precipLabel = "in."; //initialize to in
    
    
        // //Processing - calculate average temperature and total precipitation
        // for( int index = 0; index < temperature.length; index++)
        // {
        //     totalTemp += temperature[index];
        // }

        //     double avgTemp = totalTemp / temperature.length;

        // for (int index = 0; index < precipitation.length; index++)
        // {
        //     totalPrecip += precipitation[index];
        // }
    
    
        // //Output: display table of weather data including average and total
        // System.out.println();
        // System.out.println("           Weather Data");
        // System.out.println("      Location: " + city +", " + state);
        // System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        // System.out.println();
        // System.out.println("***************************************************");

        // for( int index = 0; index < month.length; index++)
        // {
        // System.out.println(month[index] + "       " + temperature[index] + "                " + precipitation[index]);
        // }

        // System.out.println("***************************************************");
        // System.out.println();
        // System.out.println("Average: " + avgTemp + "    Total: " + totalPrecip);

    }//end main
}//end class