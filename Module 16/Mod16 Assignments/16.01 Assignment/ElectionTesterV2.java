/**
 * Purpose:  This class defines a Candidate by its name and number of votes.
 *
 * @author Jing Cao
 * @version 9/5/19
 */

import java.util.*;

public class ElectionTesterV2 {
	public static void main(String[] args) {

		List<Candidate> candidates = new ArrayList<Candidate>();
		candidates.add(new Candidate("Tom", 10));
		candidates.add(new Candidate("Candy", 15));
		candidates.add(new Candidate("Mike", 8));
		candidates.add(new Candidate("Florence", 7));
		candidates.add(new Candidate("Dorian", 10));

		System.out.println("Raw election data: \n");
		CandidateInfo(candidates);
		System.out.println("\n");
		System.out.println("Election results: \n");
		Table(candidates);
		System.out.println("Total number of votes cast is election: " + TotalVotes(candidates));

	}

	public static void CandidateInfo(List<Candidate> array) {

		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).getName() + " received " + array.get(i).getVotes() + " votes.");
		}

	}

	public static int TotalVotes(List<Candidate> array) {

		int total = 0;

		for(Candidate person : array) {

			total += person.getVotes();

		}
	
		return total;

	}

	public static void Table(List<Candidate> array) {

		int total = TotalVotes(array);

		System.out.printf("%-24s%-24s%s%n", "Candidate", "Votes Received", "% of Total Votes");
		for(Candidate person : array) {
			System.out.printf("%-24s%-24s%s%n", person.getName(), person.getVotes(), (person.getVotes() / total) * 100); 
		}
	}
}