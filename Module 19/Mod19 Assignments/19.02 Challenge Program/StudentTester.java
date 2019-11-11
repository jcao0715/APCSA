/*
 * Purpose: Satisty requirements of 19.02 Challenge Program.
 * 
 * @author Jing Cao
 * @version 11/10/19
 */

public class StudentTester {

	public static void main(String[] args) {

		double[] obj1Grades = {89.50, 78.00, 95.00, 63.50, 94.00};
		Student obj1 = new Student("Benjamin", "Grimm", obj1Grades, "A");

		double[] obj2Grades = {88.00, 90.50, 100.00, 88.50, 90.00, 100.00};
		Student obj2 = new Student("Raven", "Darkholme", obj2Grades, "A");

		double obj3Grades = {100.00, 60.50};
		Student obj3 = new Student("Barbara", "Gordon", obj3Grades, "A");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}