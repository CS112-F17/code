public class TwoDArrays {

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

	public static void main(String[] args) {

		double[][] scores = new double[2][3];
		
		scores[0][0] = 98;
		scores[0][1] = 72;
		scores[0][2] = 88;

		scores[1][0] = 94;
		scores[1][1] = 92;
		scores[1][2] = 97;

		display(scores);



	}


}