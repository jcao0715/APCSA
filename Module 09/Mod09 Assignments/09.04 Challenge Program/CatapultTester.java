/**
 * Purpose: Write a program to calculate the trajectory of a projectile based on launch angles and launch velocities.
 *
 * @author Jing Cao
 * @version 05/27/19
 */

public class CatapultTester {

    public static void main(String[] args) {

        //declare 2D array
        Catapult[][] catapults = new Catapult[7][6];

        //initializes objects of array
        int vel;

        for(int row = 0; row < catapults.length; row++)
        {
            vel = 5 * row + 20;

            for(int col = 0;col < catapults[0].length; col++)
            {
                catapults[row][col] = new Catapult(vel, 5 * col + 20);
            }

        }

        //format output and calculates distance
        System.out.printf("%48s%n", "Projectile Distance (feet)");
        System.out.printf("MPH %10s %10s %10s %10s %10s %10s %n", "25 Deg", "30 Deg", "35 Deg", "40 Deg", "45 Deg", "50 Deg");
        System.out.println("=====================================================================");

        for(Catapult[] catapult : catapults)
        {
            System.out.printf("%2.0f", catapult[0].getVelocity());

            for(int col = 0; col < catapults[0].length; col++)
            {
                catapult[col].calcDistance();
                System.out.printf("%11.1f", catapult[col].getDistance());
            }

            System.out.println();
        }

    }

}