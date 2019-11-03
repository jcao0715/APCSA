/**
 * Purpose:  Demonstrate my understanding of the concepts taught in Module 16.
 *
 * @author Jing Cao
 * @version 11/3/19
 */

public class Student 
{
	private String name;
	private int obj1;
	private int obj2;
	private int obj3;
	private int obj4;
	private int obj5;

	public Student(String n, int q1, int q2, int q3, int q4, int q5)
	{
		name = n;
		obj1 = q1;
		obj2 = q2;
		obj3 = q3;
		obj4 = q4;
		obj5 = q5;
	}
	
	public int getQuiz(int num)
	{
		if(num == 1) {
			return obj1;
		}

		else if(num == 2) {
			return obj2;
		}

		else if(num == 3) {
			return obj3;
		}

		else if(num == 4) {
			return obj4;
		}

		else if(num == 5) {
			return obj5;
		}
		
		else {
			return 0;
		}
	}
	
	public String getName()
	{
		return n;
	}
	
	public void setQuiz(int num, int score)
	{	
		if(num == 1) {
			obj1 = score;
		}

		else if(num == 2) {
			obj2 = score;
		}

		else if(num == 3) {
			obj3 = score;
		}

		else if(num == 4) {
			obj4 = score;
		}

		else if(num == 5) {
			obj5 = score;
		}

		else {
			System.out.println("Invalid number");
		}
	}
	
	public void setName(String name)
	{
		name = n;
	}

	public String toString()
	{
		return String.format("%-16s%-8d%-8d%-8d%-8d%-8d", name, obj1, obj2, obj3, obj4, obj5);
	}
	
}