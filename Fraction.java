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
		* Return a string representation of the Fraction.
	**/
	public String toString() {
		return numerator + "/" + denominator;
	}

}