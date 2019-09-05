/**
 * Purpose:  This class defines a Candidate by its name and number of votes.
 *
 * @author Jing Cao
 * @version 9/5/19
 */

public class ElectionTesterV3 {

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
}