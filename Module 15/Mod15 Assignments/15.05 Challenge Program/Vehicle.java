/**
 * @purpose: Practice interfaces and abstract classes.
 * 
 * @author: Jing Cao
 * @version: 10/26/19
 */

public abstract class Vehicle implements Product{

	private String name;
	private double cost;

	public Vehicle(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}
}