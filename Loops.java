/**
	A class to demonstrate syntax of the loops
	in Java.
	@author Sami Rollins
	**/
	public class Loops {

		public static void main(String[] args) {

		//declare constants
		final int SUM_MAX = 20;
		final int PRINT_MIN = 0;
		final int PRINT_MAX = 5;

		//use a for loop to sum the numbers
		//from 0 to 20
		int sum1 = 0;

		for(int i = 0; i < SUM_MAX; i++) {

			sum1 += i;
		}

		System.out.println("Sum of numbers 0-20: " + sum1);

		//separating the output
		System.out.println("\n***************\n");

		//use a for loop to sum the even numbers from 0 to 20
		int sum2 = 0;

		for(int i = 0; i < SUM_MAX; i += 2) {
			sum2 += i;
		}		

		System.out.println("Sum of even numbers 0-20: " + sum2);

		//separating the output
		System.out.println("\n***************\n");

		//alterative approach
		//use a for loop to sum the even numbers from 0 to 20
		int sum3 = 0;

		for(int i = 0; i < SUM_MAX; i++) {

			if(i % 2 == 0) {
				sum3 += i;
			}

		}


		System.out.println("Sum of even numbers 0-20: " + sum3);

		//separating the output
		System.out.println("\n***************\n");

		//use a while loop to sum the numbers from 0-20
		
		int sum4 = 0;

		int num = 0; //initialize control varaible
		while(num < SUM_MAX) {

			sum4 += num;
			num++;			

		}

		System.out.println("Sum of numbers 0-20: " + sum4);

		//separating the output
		System.out.println("\n***************\n");
		System.out.println("\n***************\n");
		System.out.println("\n***************\n");
		System.out.println("\n***************\n");

		//use a nested for loop to print the
		//following pattern
		//0
		//01
		//012
		//0123
		//01234


		 //for each row		
		for(int i = PRINT_MIN; i < PRINT_MAX; i++) {

			//for each col
			for(int j = 0; j <= i; j++) {
				System.out.print(i);
			}		
			System.out.println();			
		}

		//separating the output
		System.out.println("\n***************\n");

		//43210
		for(int i = PRINT_MAX-1; i >= PRINT_MIN; i--) {
			System.out.print(i);		
		}

		System.out.println();

		//separating the output
		System.out.println("\n***************\n");

		//use a nested for loop to print the
		//following pattern
		//01234
		//0123
		//012
		//01
		//0

		

	}

}