/**
 * Purpose: Create a classes that implement the insertion sort.
 *
 * @author Jing Cao
 * @version 10/19/19
 *
 */

public class TestMovieV2 {

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

        insertionYear(movies, 1);
        System.out.println("<<<< After Sorting Year Ascending>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        insertionYear(movies, 2);
         System.out.println("<<<< After Sorting Year Descending>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        insertionTitle(movies, 1);
         System.out.println("<<<< After Sorting Title Ascending>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        insertionTitle(movies, 2);
         System.out.println("<<<< After Sorting Title Descending>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        insertionStudio(movies, 1);
         System.out.println("<<<< After Sorting Studio Ascending>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        insertionStudio(movies, 2);
         System.out.println("<<<< After Sorting Studio Descending>>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

	}

	public static Movie[] insertionYear(Movie[] source, int num) {
		Movie[] dest = new Movie[10];

		if(num == 1) {
		for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getYear() > dest[k-1].getYear() )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
        }

        return dest;
	}

	if(num == 2) {
        	for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getYear() < dest[k-1].getYear() )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
        } 
        return dest;
        }

        return dest;

    }

    public static Movie[] insertionTitle(Movie[] source, int num) {
    	Movie[] dest = new Movie[ source.length ];

    	if (num == 1) {
        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getTitle().compareTo( dest[k-1].getTitle() ) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            } 
        return dest;
    	}

    	if(num == 2) {
        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getTitle().compareTo( dest[k-1].getTitle() ) < 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            } 
        return dest;
    	}

    	return dest;
    }

    public static Movie[] insertionStudio(Movie[] source, int num) {
    	Movie[] dest = new Movie[ source.length ];

    	if (num == 1) {
        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getStudio().compareTo( dest[k-1].getStudio() ) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            } 
        return dest;
    	}

    	if(num == 2) {
        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getStudio().compareTo( dest[k-1].getStudio() ) < 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            } 
        return dest;
    	}

    	return dest;
    }
}