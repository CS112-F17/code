import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {

		// String s1 = "cat";
		// String s2 = "coffee";
		// System.out.println(s1.compareTo(s2));
		// if(s1.compareTo(s2)  0) {
		// 	System.out.println("Same strings");
		// }

		// ArrayList<String> words = new ArrayList<String>();
		// words.add("cat");
		// words.add("banana");
		// words.add("dragon");
		// words.add("apple");

		// Collections.sort(words);

		// for(String word: words) {
		// 	System.out.println(word);
		// }

		ArrayList<Name> names = new ArrayList<Name>();
		names.add(new Name("Bob", "Smith"));
		names.add(new Name("Alex", "Smith"));
		names.add(new Name("Sally", "Jones"));
		names.add(new Name("Herb", "Zuniga"));

		Collections.sort(names);

		for(Name name: names) {			
			System.out.println(name);
		}




	}

}