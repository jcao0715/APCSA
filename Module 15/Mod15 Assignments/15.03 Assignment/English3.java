/**
 * This class is an abstract class defining homework.
 *
 * @author Jing Cao
 * @version 09/22/19
 */

public class English3 extends Homework3{ 

	public English3(){
		super();
	}

	 public void createAssignment(int x) {
                 setNumPages(10);
                 setSubject("English");
         }

    public void doHomework() {
    	setNumPages(5);
    }
}