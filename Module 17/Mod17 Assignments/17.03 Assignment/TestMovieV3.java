/**
 * Purpose: Create a classes that implement the selection sort.
 *
 * @author Jing Cao
 * @version 10/19/19
 *
 */

public class TestMovieV3 {

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

        selectionYear(movies, 1);
        System.out.println("<<<< After Sorting Year Ascending>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        selectionYear(movies, 2);
         System.out.println("<<<< After Sorting Year Descending>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        selectionTitle(movies, 1);
         System.out.println("<<<< After Sorting Title Ascending>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        selectionTitle(movies, 2);
         System.out.println("<<<< After Sorting Title Descending>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        selectionStudio(movies, 1);
         System.out.println("<<<< After Sorting Studio Ascending>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        selectionStudio(movies, 2);
         System.out.println("<<<< After Sorting Studio Descending>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

	}

    public static Movie[] selectionYear(Movie[] source, int num) {
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

            Movie temp = source[i];
            source[ i ] = source[ posmax ];
            source[ posmax ] = temp;
        }
        return source;

    }

    public static Movie[] selectionTitle(Movie[] source, int num) {
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

            Movie temp = source[i];
            source[ i ] = source[ posmax ];
            source[ posmax ] = temp;
        }
        return source;
    }

    public static Movie[] selectionStudio(Movie[] source, int num) {
        int posmax;

        for (int i = source.length - 1 ; i > 0 ; i-- )
        {
            posmax = 0;

            for (int k = 1 ; k <= i ; k++ )
            {
                String studio = source[k].getStudio();
                String maxStudio = source[posmax].getStudio();

                if (studio.compareTo(maxStudio) > 0 && num == 1)
                {
                    posmax = k;
                }
                
                else if(studio.compareTo(maxStudio) < 0 && num == 2)
                {
                    posmax = k;
                }
            }

            Movie temp = source[i];
            source[ i ] = source[ posmax ];
            source[ posmax ] = temp;
        }
        return source;
    }
}