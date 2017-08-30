import java.util.Scanner;
/**
	* A class to calculate a student grade.
**/
public class GradeCalculator {

	public static void main(String[] args) {

		//declare useful constants
		final double HW_PERCENT = .25;
		final double EXAM_PERCENT = .50;
		final double PROJECT_PERCENT = .25;

		final int HW_MAX = 100;
		final int EXAM_MAX = 100;
		final int PROJECT_MAX = 200;

		//create a Scanner to take input
		Scanner scan = new Scanner(System.in);

		//ask the user for his/her homework score
		//store the result in a variable homework
		
		System.out.println("Enter homework score: ");

		int homework = scan.nextInt();
		
		String homeworkStr = scan.nextLine();
		// int homework = 0;

		// try {
		// 	homework = Integer.parseInt(homeworkStr);	
		// } catch(NumberFormatException nfe) {
		// 	System.out.println("Uh oh...bad input");
		// }


		//ask the user for his/her exam score
		//store the result in a variable exam
		System.out.println("Enter exam score: ");
		int exam = scan.nextInt();

		//ask the user for his/her project score
		//store the result in a variable project
		System.out.println("Enter project score: ");
		int project = scan.nextInt();

		System.out.println("Homework " + homework + " Exam " + exam + " Project " + project);

		//calculate final score
		double result = (HW_PERCENT*(((double)homework)/HW_MAX)) + 
							(EXAM_PERCENT*(((double)exam)/EXAM_MAX)) + 
							(PROJECT_PERCENT*(((double)project)/PROJECT_MAX));

		//show the result
		System.out.println(result);


	}
}