/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author (enter your name)
 * @version (enter today's date)
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);
        System.out.println();

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "   Antoinette played the lottery every week for a year.   ";

        //  Add examples below for the following methods:
        //    trim()
        //    length()
        //    indexOf with one and two parameters
        //    substring() with one and two parameters
        //    compareTo()
        //    any other String methods you'd like to try
        System.out.println("sample = " + sample);

        String trimmed = sample.trim();
        System.out.println("sample.trim() = " + trimmed);

        int length = sample.length();
        System.out.println("sample.length() = " + length);

        int index1 = sample.indexOf("t");
        System.out.println("sample.indexOf(\"t\") = " + index1);

        int index2 = sample.indexOf("t", 10);
        System.out.println("sample.indexOf(\"t\", 10) = " + index2);

        String substring1 = sample.substring(5, 15);
        System.out.println("sample.substring(5, 15) = " + substring1);

        String substring2 = sample.substring(15);
        System.out.println("sample.substring(15) = " + substring2);

        int compare = sample.compareTo("Hello World");
        System.out.println("sample.compareTo(\"Hello World\") = " + compare);


    }

}