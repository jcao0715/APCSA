
/**
 * Practicing String methods.
 *
 * @author Jing Cao
 * @version 11/20/18
 */
public class MethodPractice
{
    public static void main(String[ ] args)
    {
        String phone = "407–555–3326";
        int dashIndex = phone.indexOf("–");
        String newPhone = "(" + phone.substring(0,dashIndex) + ")" + phone.substring(dashIndex + 1);
        System.out.println(newPhone);
        
        String phone2 = "4075553326";
        String newPhone2 = phone2.substring(0,3) + "." + phone2.substring(3,6) + "." + phone2.substring(6);
        System.out.println(newPhone2);
        
        String date = "03/06/2017";
        date = date.replace("/" , "-");
        System.out.println(date);
        
        String city = "Tallahassee, Florida";
        city = city.replace("a" , "A");
        System.out.println(city);
        
        String name = "Anna Wright";
        //String newName = name.substring(5) + ", " + name.substring(0,4);
        //System.out.println(newName);
        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0,spaceIndex);
        String lastName = name.substring(spaceIndex + 1);
        String newName = lastName + ", " + firstName;
        System.out.println(newName);
    }
}
