/**
 * This class is an abstract class defining homework.
 *
 * @author Jing Cao
 * @version 09/15/19
 */

import java.util.*;

public class HomeworkTester{
        public static void main(String[] args) {
                Math obj1 = new Math();
                obj1.createAssignment(3);

                Science obj2 = new Science();
                obj2.createAssignment(3);

                English obj3 = new English();
                obj3.createAssignment(3);

                History obj4 = new History();
                obj4.createAssignment(3);

                ArrayList<Homework> hw = new ArrayList<Homework>();
                hw.add(obj1);
                hw.add(obj2);
                hw.add(obj3);
                hw.add(obj4);


                System.out.println("My Homework Reading");
                System.out.println("---------------------------------------------");
                for(Homework i : hw) {
                        System.out.println(i.toString());
                }
        }
}