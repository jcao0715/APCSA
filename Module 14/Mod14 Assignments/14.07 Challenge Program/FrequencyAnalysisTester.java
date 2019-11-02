/**
 * Demonstrate my knowledge of the static keyword.
 *
 * @author Jing Cao
 * @version 11/1/19
 */

import java.io.*;

public class FrequencyAnalysisTester {

	public static void main (String [] args) throws IOException {

		FrequencyAnalysis obj = new FrequencyAnalysis();
		File file = new File("plaintext.txt");
		obj.createAlphabet();
		obj.frequencyFromSubset(file);
		obj.printFromSubsetData();
		obj.outputData();
	}
}