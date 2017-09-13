import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class FileInputCSV {

	public static void main(String[] args) {

		if(args.length != 1) {
			System.out.println("usage: java FileInputCSV <filename>");
			System.exit(1);
		}

		String filename = args[0];

		File inputFile = new File(filename);

		try(Scanner input = new Scanner(inputFile)) {

			input.useDelimiter(",|\n");
			
			while(input.hasNext()) {

				String name = input.next();
				System.out.println(name);
				int score = input.nextInt();
				// System.out.println(score);

			}

		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
		}



	}

}