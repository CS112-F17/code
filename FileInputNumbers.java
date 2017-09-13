
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

/**
	A class to demonstrate how to read in a list
	of numbers from a file and store them in a list.
**/
public class FileInputNumbers {

	public static void main(String[] args) {

		//uses a relative path so words.txt
		//must be a file in the directory
		//where this program is run
		File inputFile = new File("numbers.txt");

		//cannot create an ArrayList of primitive types
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		try(Scanner input = new Scanner(inputFile)) {

			while(input.hasNextInt()) {
				int number = input.nextInt();

				//alternate option necessary to ignore
				//any non-integer input in the file
				// String line = input.nextLine();
				// int number = 0;
				// try {
				// 	number = Integer.parseInt(line);
				// } catch(NumberFormatException nfe) {
				// 	System.out.println("cannot convert to integer: " + line);
				// }
				numbers.add(number);
			}


		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
		}

		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		for(Integer i: numbers) {
			System.out.println(i);
		}

	}
}