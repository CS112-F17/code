public class TwoDArrays {

	/**
		Display the contents of the array.
	**/
	public static void display(double[][] scores) {

		//for each row
		for(int r = 0; r < scores.length; r++) {

			System.out.print("Student " + (r+1) + ": ");

			//	for each column
			for(int c = 0; c < scores[r].length; c++) {
				//		print item	
				System.out.print(scores[r][c] + " ");	
			}
			System.out.println();

		}
	}

	/**
		Return the highest score from any student on any
		assignment.
		**/
		public static double highScore(double[][] scores) {

			double highScore = scores[0][0];

			for(double[] row: scores) {

				for(double score: row) {

					if(score > highScore) {
						highScore = score;
					}

				}
			}
			return highScore;

		}

	/**
		Return a one-dimensional array containing the average
		score for each student.
		**/
		public static double[] average(double[][] scores) {

			double[] averages = new double[scores.length];
			
			//for each row - r
			for(int r = 0; r < scores.length; r++) {			

				double total = 0;				
				//	add each item in row				
				for(int c = 0; c < scores[r].length; c++) {
					total += scores[r][c];
				}

				//	divide by number of items in row
				double average = total / scores[r].length;
				//	add to averages array - at position r
				averages[r] = average;
			}

			return averages;

		}

		public static void main(String[] args) {

			double[][] scores = new double[2][3];

			scores[0][0] = 98;
			scores[0][1] = 72;
			scores[0][2] = 88;

			scores[1][0] = 94;
			scores[1][1] = 92;
			scores[1][2] = 97;

			display(scores);
			System.out.println(highScore(scores));
			double[] averages = average(scores); 
			for(double d: averages) {
				System.out.println(d);
			}



		}


	}