/**
	A class to build a list of students from a CSV file.
**/

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class StudentListBuilder {


	/**
		Return a StudentList constructed from the data in file.
		Return null if the file does not exist.
	**/
	public StudentList buildStudentList(String file) {

		StudentList sl = new StudentList();

		//add stuff to the list
		File inputFile = new File(file);

		try(Scanner input = new Scanner(inputFile)) {
			
			input.useDelimiter(",|\n");
			
			while(input.hasNext()) {
				
				//read in a String
				String name = input.next();

				//read in integer
				int id = input.nextInt();

				Student student = new Student(name, id);
				sl.addStudent(student);
			}

		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
			return null;
		}

		return sl;

	}

}