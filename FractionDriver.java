/**
	* A class to test the Fraction class.
**/
public class FractionDriver {

	/**
		* Main method.
	**/
	public static void main(String[] args) {

		//declare a variable of type fraction
		//construct a new Fraction object with
		//numerator 1 and denominator 3
		Fraction f1 = new Fraction(1, 3);
		//print the fraction
		System.out.println(f1.toString());

		//declare a variable of type fraction 
		//construct a new Fraction object 
		//using the second constructor
		Fraction f2 = new Fraction();
		System.out.println(f2.toString());
	}
}