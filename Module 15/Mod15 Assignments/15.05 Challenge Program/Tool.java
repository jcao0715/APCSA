/**
 * @purpose: Practice interfaces and abstract classes.
 * 
 * @author: Jing Cao
 * @version: 10/26/19
 */

public class Tool implements Product, Comparable<Tool> {

	private String name;
	private double cost;

	public Tool(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public int compareTo(Tool tool) {

		if(tool.getCost() > getCost()) {
			return 1;
		}

		else if(tool.getCost() == getCost()) {
			return 0;
		}

		else {
			return -1;
		}
	}
}