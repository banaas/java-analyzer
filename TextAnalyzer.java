import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class TextAnalyzer {

	public static void main(String[] args) {

// Initialize all counts at the start.

		int charCount = 0;
		int upCount = 0;
		int lowCount = 0;
		int other = 0;
		try {
// User must input the file name & extension to allow the Scanner to work.

			System.out.print("Please enter the file name you would like to scan : ");
            		Scanner in = new Scanner(System.in);
            		File file = new File(in.nextLine());
            		in = new Scanner(file);
			
			while (in.hasNext()) {
				String s = in.nextLine();
				char[] charAnalysis = s.toCharArray();
				charCount += s.length();
				for (char element : charAnalysis) {
					if (Character.isUpperCase(element)) {
						upCount++;
					} else if (Character.isLowerCase(element)) {
						lowCount++;
					} else {
						other++;
					}
				}
			}

		System.out.println("Total characters in file = " + charCount);
		System.out.println("Total upper case characters = " + upCount);
		System.out.println("Total lower case characters = " + lowCount);
		System.out.println("Other characters = " + other);
		} catch (FileNotFoundException e) {
			System.err.println("File not found:" + e);
			e.printStackTrace();
		}

	}
}


		
