/**
	A class to demonstrate use of arrays.
**/
public class ArrayExample {

	public static void main(String[] args) {

		//create an array of reference types
		Name[] names = new Name[5];
		names[0] = new Name("Bob", "Smith");


		//create an array of Strings and
		//use a count varaible to keep track
		//of the number of valid items
		int count = 0;
		String[] words = new String[10];
		words[count++] = "hello"; //count 1
		words[count++] = "goodbye";
		words[count++] = "computer";

		// System.out.println(words[3]);

		for(int i = 0; i < count; i++) {
			String s = words[i];
			if(s != null) {
				System.out.print(s.length());
				System.out.println(" - " + s.charAt(0));
			}
		}

		System.out.println("words.length = " + words.length);
		System.out.println("count = " + count);

		//int[] intArray = {3, 4, 5, 7, 2, 1}; //using initializer list
		//create an array of ints and assign some values
		int[] intArray = new int[5]; 
		intArray[0] = 34;
		intArray[1] = 98;
		intArray[2] = intArray[0] + intArray[1];

		System.out.println(intArray[2]);

	}

}