/**
 * @purpose: Practice interfaces and abstract classes.
 * 
 * @author: Jing Cao
 * @version: 10/26/19
 */

import java.util.*;

public class Inventory {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<Product>();

		Car car1 = new Car("Tesla", 125000.00);
		Car car2 = new Car("Tesla", 60000.00);
		Truck truck1 = new Truck("Hummer", 50000.00);
		Truck truck2 = new Truck("Hummer", 75000.00);
		Tool tool1 = new Tool("Saw", 100.00);
		Tool tool2 = new Tool("Saw", 20.00);
		
		products.add(car1);
		products.add(car2);
		products.add(truck1);
		products.add(truck2);
		products.add(tool1);
		products.add(tool2);
	}

	public static String takeInventory(String str, ArrayList<Product> x) {

        String product = str;
        int quantity = 0;
        double totalCost = 0;

        for(Vehicle prod : p) //checks vehicles
        {
            if(product == prod.getName())
            {
                quantity++;
                totalCost += prod.getCost();
            }
        }

        return product + ": Quantity = " + quantity + ", Total Cost = " + totalCost;
    }
}