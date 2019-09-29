/**
 * This class is an abstract class defining homework.
 *
 * @author Jing Cao
 * @version 09/28/19
 */

public abstract class Homework4 implements Comparable<Homework4> {

	 private int numPages;
     private String subject;
    
     public Homework4(){
         numPages = 0;
         subject = "none";
         }
    
    public int compareTo(Homework4 obj) {
        if(this.getNumPages() < obj.getNumPages()) {
            return -1;
        }

        else if(this.getNumPages() == obj.getNumPages()) {
            return 0;
        }

        else {
            return 1;
        }
    }
    
     public int getNumPages(){
         return numPages;
         }
       
     public void setNumPages(int pages){
         numPages = pages;
    	 }
    
     public String getSubject(){
         return subject;
    	 }
    
     public void setSubject(String type){
         subject = type;
         }
    
     public abstract void createAssignment(int x);

     public String toString(){
     	return subject + " - read " + numPages + " pages";
     }
}