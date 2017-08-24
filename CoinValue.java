/**
	* A class to calculate the value of a set of coins.
	* @author srollins
**/
public class CoinValue {

	/**
		* Main method.
	**/
	public static void main(String[] args) {

		//constant to track the value of a nickel
		final double NICKEL_VALUE = .05;

		// declare variables to hold the count of each type
		// of coin
		int numNickels = 3;
		int numDimes = 4; 
		int numQuarters = 20;

		//calculate total value 
		double totalCoins = (numNickels * NICKEL_VALUE) + 
								(numDimes * .1) + 
								(numQuarters * .25);

		//display the result
		String output = "Value: $" + totalCoins;
		System.out.println(output);				


	}


}