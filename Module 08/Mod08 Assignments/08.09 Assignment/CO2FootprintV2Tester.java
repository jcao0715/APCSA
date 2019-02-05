/**
 * This class tests the CO2FootprintV2 class
 *
 * A single instance of the CO2FootprintV2 class is used to invoke the mothods
 * and calculate the tons of CO2 and pounds of CO2 for 2410 gallons of gas.
 * 
 * @author Jing Cao
 * @version 02/04/19
 */
public class CO2FootprintV2Tester
{
    public static void main(String[] args)
    {
        //declaration of variables
        double gallonsOfGas = 2410;

        //invoke default constructor
        CO2FootprintV2 footprint = new CO2FootprintV2(gallonsOfGas);

        //call methods
        footprint.calcTonsCO2();
        footprint.convertTonsToPounds();

        //print results
        System.out.println("           CO2 Emissions");
        System.out.println("  Gallons   Pounds      Tons");
        System.out.println("  of Gas   from Gas   from Gas");
        System.out.println("  ****************************");
        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(),
                                                      footprint.getPoundsCO2(),
                                                      footprint.getTonsCO2());

        System.out.println();
    }
}
