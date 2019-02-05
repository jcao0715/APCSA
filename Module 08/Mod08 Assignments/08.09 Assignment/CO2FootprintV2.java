/**
 * @purpose: This class instantiates CO2 footprint objects with four private instance variables.
 * It contains mutator methods to calculate the amount of tons of CO2 and to convert
 * tons to pounds.
 * It contains getter methods for each private instance variable. 
 * Private instance variables include myGallonsUsed, myTonsCO2, and myPoundsCO2.
 *
 * @author Jing Cao
 * @version 02/04/19
 */
public class CO2FootprintV2
{
    //declaration of private instance variables
    private double myGallonsUsed;       //gallons of gas used
    private double myTonsCO2;           //tons of CO2 released
    private double myPoundsCO2;         //pounds of CO2 released

    /**
     * Constructor for objects of type CO2FoortprintV2
     * @param gallons gallons of gas used
     * Precondition: gallons is greater than or equal to zero
     */
    CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
    }

    /**
     * Mutator method to calculate tons of CO2 released (no parameters)
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
     * Mutator method used to convert tons to pounds (no parameters)
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the value of the amount of gallons used (no parameters)
     * @return amount of gallons used
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
     * Getter method to return the value of the amount of tons of CO2
     * @return tons of CO2
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * Getter method to reutrn the value of the amount of pounds of CO2
     * @return pounds of CO2
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}
