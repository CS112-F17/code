import java.util.ArrayList;

/**
	Initial example of how to use ArrayList syntax.
**/
public class ArrayListExample {

	public static void main(String[] args) {

		//declare and initialize an ArrayList of String
		ArrayList<String> words = new ArrayList<String>();

		//add some strings to the list
		words.add("hello");
		words.add("goodbye");

		//iterate over the list using a regular for loop
		//note use of methods size and get
		//the first item is at index 0
		for(int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			System.out.println(word);
		}

		//iterate over the list using an enhanced for loop
		//also called a foreach loop
		for(String word: words) {
			System.out.println(word);
		}

	}


}