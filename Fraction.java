/**
	* A class to represent a fraction.
	* @author srollins
**/
public class Fraction {

	//data members
	private int numerator;
	private int denominator;

	/**
	  * Constructor.
	**/
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;

	}

	/**
		* Constructor that takes no input.
	**/
	public Fraction() {
		this.numerator = 0;
		this.denominator = 0;
		// this(0, 0);
	}

	/**
		* Get the numerator.
	**/
	public int getNumerator() {
		//either option is OK since we only have 
		//access to the data member numerator

		// return numerator;
		return this.numerator;
	}

	/**
		* Get the denominator.
	**/
	public int getDenominator() {
		return this.denominator;
	}

	/**
		* Update the numerator;
	**/
	public void setNumerator(int newNumerator) {
		numerator = newNumerator;
	}

	/**
		* Return a string representation of the Fraction.
	**/
	public String toString() {

		boolean result = isValid();
		String resultStr = "";

		if(!result) {
			resultStr = "Invalid";
		} else {
			resultStr = numerator + "/" + denominator;
		}
		
		return resultStr;
		
	}

	/**
		* Private helper method to return true
		* if the fraction is valid (denominator is not 0)
		* and false otherwise.
	**/
	private boolean isValid() {
		if(denominator == 0) {
			return false;
		}
		return true;
	}


}