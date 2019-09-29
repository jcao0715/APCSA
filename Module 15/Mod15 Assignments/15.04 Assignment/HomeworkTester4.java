/**
 * This class is an abstract class defining homework.
 *
 * @author Jing Cao
 * @version 09/28/19
 */

import java.util.*;

public class HomeworkTester4{

        public static void main(String[] args) {
                Math4 obj1 = new Math4();
                obj1.createAssignment(3);

                Science4 obj2 = new Science4();
                obj2.createAssignment(3);

                English4 obj3 = new English4();
                obj3.createAssignment(3);

                History4 obj4 = new History4();
                obj4.createAssignment(3);

                ArrayList<Homework4> hw = new ArrayList<Homework4>();
                hw.add(obj1);
                hw.add(obj2);
                hw.add(obj3);
                hw.add(obj4);

                System.out.println("My Homework List\n----------------------------------------------");
                for(Homework4 i : hw) {
                        System.out.println(i);
                }

                System.out.println("Comparing My Homework\n--------------------------------------------------");
                for(int x = 1; x < 4; x++) {
                        for(int y = 2; y < 5; y++) {
                if(hw.get(x).compareTo(hw.get(y)) == 0)
                System.out.println("The homework for " + hw.get(x).getNumPages() + " and " + hw.get(y).getNumPages() + " are the same number of pages");
                
                else if(hw.get(x).compareTo(hw.get(y)) == 1)
                System.out.println("The homework for " + hw.get(x).getNumPages() + " has more pages than the homework for " + hw.get(y).getNumPages());
                
                else
                System.out.println("The homework for " + hw.get(x).getNumPages() + " has less pages than the homework for " + hw.get(y).getNumPages());
                        }
                }
        }
}