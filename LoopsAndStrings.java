/**
	A class to demonstrate how to use the methods of the String class.
**/
public class LoopsAndStrings {

	public static void main(String[] args) {

		//string with four whitespace characters, including a
		//newline and a tab
		String s = "hello\nclass\tit's only Monday!";
		//use the length method to determine the length of the string
		int size = s.length();

		// System.out.println("length of string - " + s + " - is " + size);

		int wscount = 0;

		for(int i = 0; i < size; i++) {
			char c = s.charAt(i);
			//use the static method isWhitespace in the Character
			//class to determine whether a whitespace has been foundx
			if(Character.isWhitespace(c)) {
				System.out.println("whitespace found at position: " + i);
				wscount++;
			}
		}

		System.out.println("whitespace count: " + wscount);

	}

}