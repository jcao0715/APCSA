/**
 * This class is an abstract class defining homework.
 *
 * @author Jing Cao
 * @version 09/15/19
 */

public class Math3 extends Homework3{ 

	public Math3(){
		super();
	}

	 public void createAssignment(int x) {
                 setNumPages(10);
                 setSubject("Math");
         }

    public void doHomework() {
    	setNumPages(5);
    }
}