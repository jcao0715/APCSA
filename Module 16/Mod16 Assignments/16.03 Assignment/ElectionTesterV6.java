/**
 * Purpose:  This class defines a Candidate by its name and number of votes.
 *
 * @author Jing Cao
 * @version 9/5/19
 */

import java.util.*;

public class ElectionTesterV6 {
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

	public static void ChangeName(List<Candidate> array, String find, String replace) {

		for(int i = 0; i < array.size(); i++) {

			if(array.get(i).getName().equals(find)) {

				array.get(i).setName(replace);
			}
		}
	}

	public static void ChangeVotes(List<Candidate> array, String find, int replace) {

		for(int i = 0; i < array.size(); i++) {

			if(array.get(i).getName().equals(find)) {

				array.get(i).setVotes(replace);
			}
		}
	}

	public static void ChangeInfo(List<Candidate> array, String find, String newName, int newVotes) {

		for(int i = 0; i < array.size(); i++) {

			if(array.get(i).getName().equals(find)) {

				array.get(i).setName(newName);
				array.get(i).setVotes(newVotes);
			}
		}
	}

	public static void InsertPosition(List<Candidate> array, int position, String name, int votes) {

		array.add(position, new Candidate(name, votes));

	}

	public static void InsertName(List<Candidate> array, String find, String name, int votes) {

		int location  = 0;
		for(int i = 0; i < array.size(); i++) {
			if(array.get(i).getName().equals(find)) {
				location = i;
			}
		}

		array.add(location, new Candidate(name, votes));
	}
}