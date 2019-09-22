/**
 * This class is an abstract class defining homework.
 *
 * @author Jing Cao
 * @version 09/22/19
 */

public class Science3 extends Homework3{ 

	public Science3(){
		super();
	}

	 public void createAssignment(int x) {
                 setNumPages(10);
                 setSubject("Science");
         }

    public void doHomework() {
    	setNumPages(5);
    }
}