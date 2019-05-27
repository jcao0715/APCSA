/**
 * Purpose: Write a program to calculate the trajectory of a projectile based on launch angles and launch velocities.
 *
 * @author Jing Cao
 * @version 05/27/19
 */

public class Catapult {

    private double myVelocity;
    private double myDegrees;
    private double distance;

    public Catapult(double velocity, double degrees)
    {
        myVelocity = velocity;
        myDegrees = degrees;
    }

    public void calcDistance()
    {
        distance = (Math.pow(myVelocity, 2) * Math.sin(2 * Math.toRadians(myDegrees)) / 9.8);
    }

    public double getVelocity()
    {
        return myVelocity;
    }

    public double getDegrees()
    {
        return myDegrees;
    }

    public double getDistance()
    {
        return distance;
    }

}