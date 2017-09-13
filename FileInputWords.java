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

		//use try-with-resources so that our file
		//is auto-closed.
		try(Scanner input = new Scanner(inputFile)) {

			//as long as there is another word in the file
			while(input.hasNext()) {
				//read and print the word
				String word = input.next();
				System.out.println(word);
			}

		} catch(FileNotFoundException fnf) {
			//print the exception object message in case the
			//file is not found
			System.out.println(fnf.getMessage());
		}

		System.out.println("Thank you for playing...");

	}

}