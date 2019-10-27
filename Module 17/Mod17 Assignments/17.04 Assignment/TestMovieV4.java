/**
 * Purpose: Create a classes that implement the merge sort.
 *
 * @author Jing Cao
 * @version 10/26/19
 *
 */

public class TestMovieV4 {

	public static void main(String[] args) {

		Movie[] movies = new Movie[10];

		movies[0] = new Movie("The Hunchback of Notre Dame", 1996, "Disney");
		movies[1] = new Movie("Mulan", 1998, "Disney");
		movies[2] = new Movie("Pocahontas", 1995, "Disney");
		movies[3] = new Movie("Tarzan", 1999, "Disney");
		movies[4] = new Movie("The Little Mermaid", 1989, "Disney");
		movies[5] = new Movie("Snow White", 1937, "Disney");
		movies[6] = new Movie("Mary Poppins", 1964, "Disney");
		movies[7] = new Movie("Sleeping Beauty", 1959, "Disney");
		movies[8] = new Movie("The Lion King", 1994, "Disney");
		movies[9] = new Movie("Pinocchio", 1940, "Disney");

		System.out.println("    <<<< Before Sorting >>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        sortYears(movies, 0, movies.length - 1);
        System.out.println("<<<< After Sorting Year>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        sortTitles(movies, 0, movies.length - 1);
        System.out.println("<<<< After Sorting Title>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        sortStudios(movies, 0, movies.length - 1);
        System.out.println("<<<< After Sorting Studio>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

	}

    public static void sortYears(Movie[] a, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        sortYears( a, low, mid );       
        sortYears( a, mid + 1, high);   

        mergeYears( a, low, mid, high);
    }

    public static void mergeYears( Movie[] a, int low, int mid, int high )
    {
        Movie[] temp = new Movie[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = a[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else if( a[ i ].getYear() < a[ j ].getYear() )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else
            {
                temp[ n ] = a[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            a[ k ] = temp[ k - low ];
    }

    public static void sortStudios(Movie[] a, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        sortYears( a, low, mid );       
        sortYears( a, mid + 1, high);   

        mergeYears( a, low, mid, high);
    }

public static void mergeStudios(Movie[] a, int low, int mid, int high)
    {
        Movie[] temp = new Movie[high - low + 1];

        int i = low;
        int j = mid + 1;
        int n = 0;

        while(i <= mid || j <= high)
        {

            if(i > mid)
            {
                temp[n] = a[j];
                j++;
            }

            else if(j > high)
            {
                temp[n] = a[i];
                i++;
            }

            else if(a[i].getStudio().compareTo(a[j].getStudio()) < 0)
            {
                temp[n] = a[i];
                i++;
            }

            else
            {
                temp[n] = a[j];
                j++;
            }

            n++;
        }

        for(int k = low; k <= high; k++)
            a[k] = temp[k - low];
    }

    public static void sortTitles(Movie[] a, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        sortYears( a, low, mid );       
        sortYears( a, mid + 1, high);   

        mergeYears( a, low, mid, high);
    }

    public static void mergeTitles(Movie[] a, int low, int mid, int high)
    {
        Movie[] temp = new Movie[high - low + 1];

        int i = low;
        int j = mid + 1;
        int n = 0;

        while(i <= mid || j <= high)
        {

            if(i > mid)
            {
                temp[n] = a[j];
                j++;
            }

            else if(j > high)
            {
                temp[n] = a[i];
                i++;
            }

            else if(a[i].getTitle().compareTo(a[j].getTitle()) < 0)
            {
                temp[n] = a[i];
                i++;
            }

            else
            {
                temp[n] = a[j];
                j++;
            }

            n++;
        }

        for(int k = low; k <= high; k++)
            a[k] = temp[k - low];
    }
}