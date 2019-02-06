/**
 * @purpose: Write a program that calculates the amount of carbon dioxide produced in a year from waste by a household and compare how recycling can reduce the CO2 footprint.
 *
 * @author Jing Cao
 * @version 02/05/19
 *
 */
import java.util.ArrayList;

public class CO2FromWasteTester
{
   public static void main(String[] args)
   {
       ArrayList<CO2FromWaste> households = new ArrayList<CO2FromWaste>();
           // add households to the ArrayList
       households.add(new CO2FromWaste(1, true, true, true, true));
       households.add(new CO2FromWaste(6, true, false, true, false));
       households.add(new CO2FromWaste(3, false, true, true, false));
       households.add(new CO2FromWaste(2, true, true, false, true));
       households.add(new CO2FromWaste(10, true, false, false, true));
       households.add(new CO2FromWaste(1, false, true, true, true));

       for(CO2FromWaste dataRecord : households)
       {
          dataRecord.calcGrossWasteEmission();
          dataRecord.calcWasteReduction();
          dataRecord.calcNetWasteReduction();
       }

       System.out.println("|       |        |                                         |             Pounds of CO2             |");
       System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
       System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

       

       for(int index = 0; index < households.size(); index ++)
       {
           CO2FromWaste dataRecord = households.get(index);
           System.out.printf("%5d %8d %10b %10b %10b %9b %12.1f %11.1f %13.1f\n", index,  dataRecord.getNumPeople(), dataRecord.getPaper(), dataRecord.getPlastic(), dataRecord.getGlass(), dataRecord.getCans(), dataRecord.getEmissions(), dataRecord.getReduction(), dataRecord.getNetEmissions());

       }
   }
}
