import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

/**
	A class to demonstrate how to read a CSV file.
**/
public class FileInputCSV {

	public static void main(String[] args) {

		//expects a command line argument specifying the 
		//location of the file
		if(args.length != 1) {
			//print out how the program should be used and exit
			//if the argument is not passed correctly
			System.out.println("usage: java FileInputCSV <filename>");
			System.exit(1);
		}

		//store the filename 
		String filename = args[0];

		File inputFile = new File(filename);

		try(Scanner input = new Scanner(inputFile)) {
			
			//use the , or newline character as a delimiter
			//assumes that there are NO spaces between the 
			//comma and the next token
			input.useDelimiter(",|\n");
			
			while(input.hasNext()) {
				//read in a String
				String name = input.next();
				//print String
				System.out.println(name);
				//read in integer
				int score = input.nextInt();
				//if we don't need to use the integer
				//value then just ignore it (never use score!)
			}

		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
		}



	}

}