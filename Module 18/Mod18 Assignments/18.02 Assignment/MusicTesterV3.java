/**
 * Purpose: Create a program that implements sequential search.
 *
 * @author Jing Cao
 * @version 10/26/19
 */

public class MusicTesterV3 {

	public static void main(String[] args) {

		Music[] song = new Music[10];
		song[0] = new Music("Strangers in the Night", 1966, "Frank Sinatra");
		song[1] = new Music("Summer Wind", 1966, "Frank Sinatra");
		song[2] = new Music("It was a Very Good Year", 1965, "Frank Sinatra");
		song[3] = new Music("Somewhere In Your Heart", 1964, "Frank Sinatra");
		song[4] = new Music("Forget Domani", 1965, "Frank Sinatra");
		song[5] = new Music("Somethin' Stupid", 1967, "Frank Sinatra");
		song[6] = new Music("That's Life", 1966, "Frank Sinatra");
		song[7] = new Music("This Town", 1967, "Frank Sinatra");
		song[8] = new Music("Softly, As I Leave You", 1964, "Frank Sinatra");
		song[9] = new Music("Fly Me To The Moon", 1954, "Frank Sinatra");

		
	}

	public static Music[] selectionYear(Music[] source, int num) {
        int posmax;

        for (int i = source.length - 1 ; i > 0 ; i-- )
        {
            posmax = 0;

            for (int k = 1 ; k <= i ; k++ )
            {
                int year = source[k].getYear();
                int maxYear = source[posmax].getYear();

                if (year > maxYear && num == 1)
                {
                    posmax = k;
                }

                else if(year < maxYear && num == 2)
                {
                    posmax = k;
                }
            }

            Music temp = source[i];
            source[ i ] = source[ posmax ];
            source[ posmax ] = temp;
        }
        return source;
    }

    public static int binarySearchArtist(Music[] r, int toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( r[probe].getYear() < toFind)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (r[low].getYear() == toFind ))
            return low;
        else
            return -1;
    }

    public static Music[] selectionTitle(Music[] source, int num) {
        int posmax;

        for (int i = source.length - 1 ; i > 0 ; i-- )
        {
            posmax = 0;

            for (int k = 1 ; k <= i ; k++ )
            {
                String title = source[k].getTitle();
                String maxTitle = source[posmax].getTitle();

                if (title.compareTo(maxTitle) > 0 && num == 1)
                {
                    posmax = k;
                }

                else if(title.compareTo(maxTitle) < 0 && num == 2)
                {
                    posmax = k;
                }
            }

            Music temp = source[i];
            source[ i ] = source[ posmax ];
            source[ posmax ] = temp;
        }
        return source;
    }

    public static int binarySearchTitle(Music[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( r[probe].getTitle().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (r[low].getTitle().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }

    public static Music[] selectionArtist(Music[] source, int num) {
        int posmax;

        for (int i = source.length - 1 ; i > 0 ; i-- )
        {
            posmax = 0;

            for (int k = 1 ; k <= i ; k++ )
            {
                String studio = source[k].getArtist();
                String maxArtist = source[posmax].getArtist();

                if (studio.compareTo(maxArtist) > 0 && num == 1)
                {
                    posmax = k;
                }
                
                else if(studio.compareTo(maxArtist) < 0 && num == 2)
                {
                    posmax = k;
                }
            }

            Music temp = source[i];
            source[ i ] = source[ posmax ];
            source[ posmax ] = temp;
        }
        return source;
    }

    public static int binarySearchArtist(Music[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( r[probe].getArtist().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (r[low].getArtist().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }

    public static void linearPrintArtist(Music[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }
}