/**
 * This class is an abstract class defining homework.
 *
 * @author Jing Cao
 * @version 09/22/19
 */

import java.util.*;

public class HomeworkTester3{

        public static void main(String[] args) {
                Math3 obj1 = new Math3();
                obj1.createAssignment(3);

                Science3 obj2 = new Science3();
                obj2.createAssignment(3);

                English3 obj3 = new English3();
                obj3.createAssignment(3);

                History3 obj4 = new History3();
                obj4.createAssignment(3);

                ArrayList<Homework3> hw = new ArrayList<Homework3>();
                hw.add(obj1);
                hw.add(obj2);
                hw.add(obj3);
                hw.add(obj4);


                for(Homework3 i : hw) {
                        System.out.println("Before Reading: " + i.toString());
                        i.doHomework();
                        System.out.println("After Reading: " + i.toString());
                }
        }
}