/**
 * Demonstrate my knowledge of the static keyword.
 *
 * @author Jing Cao
 * @version 11/1/19
 */


import java.io.*;
import java.util.*;

public class FrequencyAnalysis {
	static ArrayList<Character> alphabet = new ArrayList<Character>();
	
	public static void createAlphabet() {
		
		for (int i = 97; i < 123; i++) {
			
			char x = (char)i;
			alphabet.add(x);
		}
	}

	static ArrayList<Integer> numCharacters = new ArrayList<Integer>();
	static int totalNum = 0;
	
	public static void frequencyFromSubset(File file) throws IOException {
		
		Scanner in = new Scanner(in);

		while (file.hasNextLine()) {
			String data = file.nextLine();
			data = data.toLowerCase();

			int num = 0;
			int index = 0;

			for (int i = 97; i < 123; i++) {
				
				char x = (char)i;
				num = 0;
				for (int j = 0; j < data.length(); j++) {
					
					char c = data.charAt(j);
					
					if (c == x) {
						num++;
					}
				}
				
				int total =+ num;
				totalNum = totalNum + num;
				numCharacters.add(index, total);

				index++;
			}
			
		}
		
	}
	
	public static void printFromSubsetData() {
		
		System.out.println("Letter\t /\t Frequency");
		
		for(int i = 0; i < alphabet.size(); i++) {
		
			char x = alphabet.get(i);
			int num = numCharacters.get(i);
			System.out.println(x + "\t /\t " + num);
		}
	}
	
	public static void outputData() throws IOException {
		
		PrintWriter output = new PrintWriter(new File("subsetDataExport.txt"));
		output.println("Letter\t /\t Frequency\t /\t Percentage");
		int index = 0;
		
		for (int i = 0; i < alphabet.size(); i++) {
		
			char x = alphabet.get(index);
			int num = numCharacters.get(index);
			double percent = (double) num / totalNum;
			percent = (double) percent * 100; 
			output.print(x + "\t /\t " + num + "\t\t /\t ");
			output.printf("%.2f\n", percent);
			index++;
		}
		
		output.close();
	}
	
	
}