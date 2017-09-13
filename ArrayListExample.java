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

		//declare and initialize an ArrayList of Student
		//we can have an ArrayList of anythin!
		ArrayList<Student> students = new ArrayList<Student>();

		//add some students to the list.
		Student s1 = new Student("Bob", "Jones", 9876, "History");
		students.add(s1);
		students.add(new Student("Sally", "Smith", 1234, "CS"));

		//use a foreach loop to iterate over the list
		for(Student s: students) {
			System.out.println(s.getId());
		}




	}


}