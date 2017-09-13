/**
	A class to demonstrate file input in Java.
	@author Sami Rollins
**/
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class FileInputWords {

	public static void main(String[] args) {

		//uses a relative path so words.txt
		//must be a file in the directory
		//where this program is run
		File inputFile = new File("words.txt");

		try(Scanner input = new Scanner(inputFile)) {

			while(input.hasNext()) {
				String word = input.next();
				System.out.println(word);
			}

		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
		}

		//uses a try-with-resources 
		System.out.println("Thank you for playing...");
		//REST OF PROGRAM

	}

}