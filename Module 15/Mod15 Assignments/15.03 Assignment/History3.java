 /**
 * This class is an abstract class defining homework.
 *
 * @author Jing Cao
 * @version 09/22/19
 */

public class History3 extends Homework3{ 

	public History3(){
		super();
	}

	 public void createAssignment(int x) {
                 setNumPages(10);
                 setSubject("History");
         }

    public void doHomework() {
    	setNumPages(5);
    }
}