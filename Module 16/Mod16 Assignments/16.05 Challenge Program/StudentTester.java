/**
 * Purpose:  Demonstrate my understanding of the concepts taught in Module 16.
 *
 * @author Jing Cao
 * @version 11/3/19
 */

import java.util.*;

public class StudentTester 
{
	public static void main(String[] args)
	{
		ArrayList<Student> class = new ArrayList<Student>();

					class.add(new Student("George Washington", 60, 10, 90, 0, 50));	
					class.add(new Student("Ted Moseby", 40, 75, 95, 80, 70));	
					class.add(new Student("Donald Duck", 1000, 73, 90, 100, 100));	
					class.add(new Student("Bill Gates", 90, 80, 90, 90, 90));	
					class.add(new Student("Alan Turing", 75, 80, 95, 74, 100));

				System.out.println("Starting Gradebook:\n");
				printBook(class);
				System.out.println();
				
				System.out.println("Changing Bill's name to Beep Beep: \n");
				class = replaceName(class, "Bill Gates", "Beep Beep");
				printBook(class);
				System.out.println();
				
				System.out.println("Changing Donald's q 3 score to 80: \n");
				class = replaceQuiz(class, "Donald Duck", 3, 80);
				printBook(class);
				System.out.println();

				System.out.println("Replacing Alan with Sully Mike: 10,20,30,40,50: \n");
				class = replaceStudent(class, "Alan Turing", "Sully Mike", 10,20,30,40,50);
				printBook(class);
				System.out.println();
				
				System.out.println("Inserting Kathy Liu: 100,99,90,100,95, before Beep: \n");
				class = insertStudent(class, "Beep Beep", "Kathy Liu", 100,99,90,100,95);
				printBook(class);
				System.out.println();
				
				System.out.println("Deleting Ted Moseby: \n");
				class = deleteStudent(class, "Ted Moseby");
				printBook(class);
				System.out.println();
				
	}
	
	public static ArrayList<Student> replaceStudent(ArrayList<Student> arr, String replace, String name, int q1, int q2, int q3, int q4, int q5) {
		ArrayList<Student> returnArr = arr;

		for(int i = 0; i < arr.size(); i++) {
			if(returnArr.get(i).getName().equalsIgnoreCase(replace)) {
				returnArr.set(i, new Student(name, q1, q2, q3, q4, q5));
			}
		}

		return returnArr;
	}

	public static ArrayList<Student> insertStudent(ArrayList<Student> arr, String find, String name, int q1, int q2, int q3, int q4, int q5) {
	ArrayList<Student> returnArr = arr;

	int index = 0;
	for(int i = 0; i < returnArr.size(); i++) {
		if(arr.get(i).getName().equalsIgnoreCase(find)) {
			index = i;
		}
	}

	returnArr.add(index, new Student(name, q1, q2, q3, q4, q5));

	return returnArr;
	}

	public static ArrayList<Student> replaceName(ArrayList<Student> arr, String nameToReplace, String name) {
		ArrayList<Student> returnArr = arr;

		for(int i = 0; i < arr.size(); i++) {
			if(returnArr.get(i).getName().equalsIgnoreCase(nameToReplace)) {
				returnArr.get(i).setName(name);
			}
		}

		return returnArr;
	}

	public static ArrayList<Student> deleteStudent(ArrayList<Student> arr, String delete) {
		ArrayList<Student> returnArr = arr;

		for(int i = 0; i < returnArr.size(); i++) {
			if(returnArr.get(i).getName().equalsIgnoreCase(delete)) {
				returnArr.remove(i);
			}
		}

		return returnArr;
	}

	public static ArrayList<Student> replaceQuiz(ArrayList<Student> arr, String name, int q, int score) {
		ArrayList<Student> returnArr = arr;

		for(int i = 0; i < arr.size(); i++) {
			if(returnArr.get(i).getName().equalsIgnoreCase(name)) {
				returnArr.get(i).setQuiz(q, score);
			}
		}

		return returnArr;
	}

	public static void printBook(ArrayList<Student> class) {
		System.out.printf("%-16s%-8s%-8s%-8s%-8s%-8s", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
		System.out.println("--------------------------------------------------");
		
		for(Student student: class) {
			System.out.println(student);
		}
	}

}