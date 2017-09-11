import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();

		words.add("hello");
		words.add("goodbye");

		for(int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			System.out.println(word);
		}

		for(String word: words) {
			System.out.println(word);
		}

	}


}