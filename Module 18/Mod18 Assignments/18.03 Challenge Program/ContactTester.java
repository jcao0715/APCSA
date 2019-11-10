/*
 * Purpose: Satisty requirements of 17.05 Challenge Program.
 * 
 * @author Jing Cao
 * @version 11/10/19
 */

public class ContactTester {

    public static void main(String[] args) {
        
        Contact[] contacts = new Contact[10];

        contacts[0] = new Contact("Jessica Martinez", "mom", "Jan 7", "(940) 470 - 6459", "martinez@gmail.com");
        contacts[1] = new Contact("Amelia Rodriguez", "dad", "Feb 11", "(790) 777 - 4683", "rodrguex@gmail.com");
        contacts[2] = new Contact("Sophie Davis", "brother", "Feb 18", "(665) 779 - 1036", "davis@gmail.com");
        contacts[3] = new Contact("Emily Miller", "sister", "Feb 20", "(650) 961 - 6413", "mill@gmail.com");
        contacts[4] = new Contact("Chloe Garcia", "nephew", "Feb 21", "(536) 426 - 4216", "garcia@gmail.com");
        contacts[5] = new Contact("Grace Johnson", "niece", "Mar 22", "(744) 519 - 0520", "johnsom@gmail.com");
        contacts[6] = new Contact("Ruby Brown", "aunt", "Apr 17", "(244) 343 - 4496", "brown@gmail.com");
        contacts[7] = new Contact("Lily Jones", "uncle", "Sep 25", "(985) 868 - 5243", "jones@gmail.com");
        contacts[8] = new Contact("Mia Williams", "grandma", "Oct 30", "(631) 797 - 8312", "williams@gmail.com");
        contacts[9] = new Contact("Lucy Smith", "grandpa", "Dec 6", "(514) 663 - 8014", "smith@gmail.com");

        printContacts(contacts);

        contacts = sortName(contacts);
        findName(contacts, "Jessica");
        findName(contacts, "Ruby Brown");

        contacts = sortEmail(contacts);    
        findEmail(contacts, "davis@gmail.com");
        findEmail(contacts, "mill@gmail.com");

        findRelation(contacts, "sister");
        findRelation(contacts, "grandpa");

        findMonth(contacts, "Feb");
        findMonth(contacts, "Oct");

        findPhone(contacts, "(244) 343 - 4496");
        findPhone(contacts, "(514) 663 - 8014");


    }

    public static Contact[] sortName(Contact[] contacts) {

        int o = 0;
        int i = 0;
        int max = 0;
        Contact temp = new Contact(" ", " ", " ", " ", " ");
        Contact[] contacts = contacts;

        for(o = contacts.length - 1; o >= 0; o--) {

            max = 0;

            for(i = 0; i <= o; in++) {

                if(contacts[i].getName().compareTo(contacts[max].getName()) > 0) {

                    max = i;

                }

                temp = contacts[o];
                contacts[o] = contacts[max];
                contacts[max] = temp;

            }

        }

        return contacts;

    }

    public static Contact[] sortEmail(Contact[] contacts) {

        int o = 0;
        int i = 0;
        int max = 0;
        Contact temp = new Contact("", "", "", "", "");
        Contact[] contacts = contacts;

        for(o = contacts.length-1; o >= 0; o--) {

            max = 0;

            for(i = 0; i <= o; i++) {

                if(contacts[i].getEmail().compareTo(contacts[max].getEmail()) > 0) {

                    max = i;

                }

                temp = contacts[o];
                contacts[o] = contacts[max];
                contacts[max] = temp;

            }

        }

        return contacts;

    }

    public static void findName(Contact[] contacts, String find) {

        int h = contacts.length;
        int l = -1;
        int search = 0;

        System.out.println("Find Name - " + find);

        while(h - l > 1) {

            search = (h + l)/2;
            
            if(contacts[search].getName().compareTo(find) > 0) {

                h = search;

            }

            else {

                l = search;

            }

        }

        if((l >= 0) && (contacts[l].getName().compareTo(find) == 0)) {

            System.out.println("Found: " + contacts[l].toString() + "\n");

        }

        else {

            System.out.println("Not Found: " + find + "\n");

        }

    }

    public static void findEmail(Contact[] contacts, String find) {
 
        int h = contacts.length;
        int l = -1;
        int search = 0;

        System.out.println("Find Email - " + find);
 
        while(h - l > 1) {
 
            search = (h+l)/2;
            
            if(contacts[search].getEmail().compareTo(find) > 0) {
 
                h = search;
 
            }
 
            else {
 
                l = search;
 
            }
 
        }

        if((l >= 0) && (contacts[l].getEmail().compareTo(find) == 0)) {
 
            System.out.println("Found: " + contacts[l].toString() + "\n");
 
        }
 
        else {
 
            System.out.println("Not Found: " + find + "\n");
 
        }
 
    }

    public static void findRelation(Contact[] contacts, String find) {
 
        int found = 0;

        System.out.println("Find Relation - " + find);

        for(int i = 0; i < contacts.length; i++) {

            if(contacts[i].getRelation().equals(find)) {

                found++;
                System.out.println("Found: " + contacts[i].toString());

            }

        }

        if(found != 0) {

            System.out.println();

        }

        else {

            System.out.println("Not Found.\n");

        }

    }

    public static void findMonth(Contact[] contacts, String find) {

        int found = 0;

        System.out.println("Find Bday - " + find);

        for(int i = 0; i < contacts.length; i++) {

            if(contacts[i].getBday().substring(0, 3).equals(find)) {

                found++;
                System.out.println("Found: " + contacts[i].toString());

            }

        }

        if(found != 0) {

            System.out.println();

        }

        else {

            System.out.println("Not Found.\n");

        }

    }

    public static void findPhone(Contact[] contacts, String find) {

        int found = 0;

        System.out.println("Find Phone - " + find);

        for(int i = 0; i < contacts.length; i++) {

            if(contacts[i].getPhone().equals(find)) {
                found++;
                System.out.println("Found: " + contacts[i].toString());

            }

        }

        if(found != 0) {

            System.out.println();

        }

        else {

            System.out.println("Not Found.\n");

        }

    }


    public static void printContacts(Contact[] contacts) {
        
        System.out.println("\nContact List:\n");
        System.out.printf("%12s%4s%8s%4s%8s%4s%10s%2s%18s\n", "Name", " ", "Relation", " ", "Birthday", " ", "Phone", " ", "Email");
        System.out.println("----------------------------------------------------------------------------");
        
        for(Contact contact : contacts) {
        
            System.out.println(contact.toString());
        
        }

        System.out.println();
    }
    
}