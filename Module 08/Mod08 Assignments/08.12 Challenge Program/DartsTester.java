/**
 * Purpose: Write a program to calculate the value of pi by simulating throwing darts at a dart board.
 *
 * @author Jing Cao
 * @version 05/25/19
 */

import java.util.*;

public class DartsTester
{
	public static void main(String [] args)
	{
		//declares objects
		Darts obj1 = new Darts(1500, 10);
		obj1.calcAvg();
		Darts obj2 = new Darts(1000, 5);
		obj2.calcAvg();
		Darts obj3 = new Darts(100, 20);
		obj3.calcAvg();
		Darts obj4 = new Darts(150, 30);
		obj4.calcAvg();
		Darts obj5 = new Darts(2000, 5);
		obj5.calcAvg();
		Darts obj6 = new Darts(500, 25);
		obj6.calcAvg();
		Darts obj7 = new Darts(250, 50);
		obj7.calcAvg();
		Darts obj8 = new Darts(10, 15);
		obj8.calcAvg();
		Darts obj9 = new Darts(750, 10);
		obj9.calcAvg();
		Darts obj10 = new Darts(2500, 100);
		obj10.calcAvg();;

		//creates arraylist of objects
		ArrayList<Darts> list = new ArrayList<Darts>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		list.add(obj6);
		list.add(obj7);
		list.add(obj8);
		list.add(obj9);
		list.add(obj10);

		//calculates max average
		double max = Double.MIN_VALUE;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getAvg() > max)
			{
				max = list.get(i).getAvg();
			}
		}

		//calculates min average
		double min = Double.MAX_VALUE;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getAvg() < min)
			{
				min = list.get(i).getAvg();
			}
		}
		
		//calculates average average
		double sum = 0;
		for(int i = 0; i < list.size(); i++)
		{
			sum += list.get(i).getAvg();
		}
		double avg = sum / list.size();

		//formats output
		System.out.printf("%-8s %20s %n", "Object", "Average PI");
		System.out.println("=============================");
		for(int i = 0; i <list.size(); i++)
		{
			System.out.printf("%-8d %20.5f %n", i, list.get(i).getAvg());
		}
		System.out.println("=============================");
		System.out.printf("Minimum: %5.5f %n", min);
		System.out.printf("Maximum: %5.5f %n", max);
		System.out.printf("Average: %5.5f %n", avg);

	}
}