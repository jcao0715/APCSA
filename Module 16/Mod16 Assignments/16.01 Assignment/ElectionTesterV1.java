/**
 * Purpose:  This class defines a Candidate by its name and number of votes.
 *
 * @author Jing Cao
 * @version 9/5/19
 */

public class ElectionTesterV1 {

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
}