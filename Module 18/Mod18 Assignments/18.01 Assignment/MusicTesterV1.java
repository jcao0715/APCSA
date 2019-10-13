/**
 * Purpose: Create a program that implements sequential search.
 *
 * @author Jing Cao
 * @version 10/13/19
 */

public class MusicTesterV1 {

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

	public static void print(Music[] r)
    	{
        System.out.println("Song                      Year        Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    	}

    public static void findSong(Music[] arr, String song) {
    	int found = -1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].getTitle().compareTo(song) == 0)
            {
                found = i;
                break;   
            }
        }
        
        if(found != -1)
        {  
            System.out.println("We found " + song + " in the album: ");
            System.out.println(arr[found]);
        }
        else
            System.out.println(song + " is not in the album");
    }

    public static void findYear(Music[] arr, int year) {
    	int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].getYear() == year)
            {
                System.out.println(arr[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   
            System.out.println(year + " is not in the album");
        }
    }

    public static void findArtist(Music[] arr, String artist) {
    	int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].getArtist().compareTo(artist) == 0)
            {
                System.out.println(arr[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   
            System.out.println(artist + " is not in the album");
        }
    }
}