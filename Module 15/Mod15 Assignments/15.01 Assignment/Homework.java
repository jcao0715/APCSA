/**
 * This class is an abstract class defining homework.
 *
 * @author Jing Cao
 * @version 09/15/19
 */

public abstract class Homework {

	 private int numPages;
     private String subject;
    
     public Homework(){
         numPages = 0;
         subject = "none";
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