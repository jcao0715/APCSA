/**
 * This class is an abstract class defining homework.
 *
 * @author Jing Cao
 * @version 09/28/19
 */

public class History4 extends Homework4{ 

	public History4(){
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