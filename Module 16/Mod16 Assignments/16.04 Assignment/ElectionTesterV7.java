/**
 * Purpose:  This class defines a Candidate by its name and number of votes.
 *
 * @author Jing Cao
 * @version 10/13/19
 */

public class ElectionTesterV7 {

	public static void main(String[] args) {

		Candidate[] candidates = new Candidate[5];
		candidates[0] = new Candidate("Tom", 10);
		candidates[1] = new Candidate("Candy", 15);
		candidates[2] = new Candidate("Mike", 8);
		candidates[3] = new Candidate("Florence", 7);
		candidates[4] = new Candidate("Dorian", 10);

		System.out.println("Raw election data: \n");
		CandidateInfo(candidates);
		System.out.println("\n");
		System.out.println("Election results: \n");
		Table(candidates);
		System.out.println("Total number of votes cast is election: " + TotalVotes(candidates));
		System.out.println();
		System.out.println("<< Changing Florence's name to Flora >>");
		System.out.println();
		ChangeName(candidates, "Florence", "Flora");
		Table(candidates);
		System.out.println();
		System.out.println("<< Changing Candy's votes to 20 >>");
		System.out.println();
		ChangeVotes(candidates, "Candy", 20);
		Table(candidates);
		System.out.println();
		System.out.println("<< Changing Tom's name to Tim and his votes to 1 >>");
		System.out.println();
		ChangeInfo(candidates, "Tom", "Tim", 20);
		Table(candidates);

	}

	public static void CandidateInfo(Candidate[] array) {

		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i].getName() + " received " + array[i].getVotes() + " votes.");
		}

	}

	public static int TotalVotes(Candidate[] array) {

		int total = 0;

		for(int i = 0; i < array.length; i++) {
			total += array[i].getVotes();
		}

		return total;

	}

	public static void Table(Candidate[] array) {

		int total = TotalVotes(array);

		System.out.printf("%-24s%-24s%s%n", "Candidate", "Votes Received", "% of Total Votes");
		for(Candidate person : array) {
			System.out.printf("%-24s%-24s%s%n", person.getName(), person.getVotes(), (person.getVotes() / total) * 100); 
		}
	}

	public static void ChangeName(Candidate[] array, String find, String replace) {

		for(int i = 0; i < array.length; i++) {

			if(array[i].getName().equals(find)) {

				array[i].setName(replace);
			}
		}
	}

	public static void ChangeVotes(Candidate[] array, String find, int replace) {

		for(int i = 0; i < array.length; i++) {

			if(array[i].getName().equals(find)) {

				array[i].setVotes(replace);
			}
		}
	}

	public static void ChangeInfo(Candidate[] array, String find, String newName, int newVotes) {

		for(int i = 0; i < array.length; i++) {

			if(array[i].getName().equals(find)) {

				array[i].setName(newName);
				array[i].setVotes(newVotes);
			}
		}
	}

	public static void InsertPosition(Candidate[] array, int position, String name, int votes) {

		for(int i = array.length - 1; i > position; i-- ) {
				array[i] = array[i - 1];
		}

		array[position] = new Candidate(name, votes);
	}

	public static void InsertName(Candidate[] array, String find, String name, int votes) {

		int location = 0;

		for(int i = 0; i < array.length; i++ ) {
			if(array[i].getName().equals(find)) {
				location = i;
			}
		}

		for(int i = array.length - 1; i > location; i-- ) {
				array[i] = array[i - 1];
		}

		array[location] = new Candidate(name, votes);
	}

	public static void DeletePosition(Candidate[] array, int position, String name, int votes) {

		if ((position > 0) && (position < array.length))
        {
            for(int i = position; i < array.length -1; i++)
                array[i] = array[i + 1];

            array[array.length-1] = null;
        }
	}

	public static void DeleteName(Candidate[] array, String find, String name, int votes) {

		int location = 0;
        int i;

        for(i = 0; i < array.length; i++)
            if((array[i] != null) && (array[i].getName().equals(find)))
            {
                location = i;
                break;
            }
            else if(array[i] == null)
            {
                location = -1;
                break;
            }

        if ((i != array.length) && (location >= 0))
        { 
            //move items up in the array
            for(i = location; i < array.length -1; i++)
                array[i] = array[i + 1];

            array[array.length-1] = null;
        }
	}
}