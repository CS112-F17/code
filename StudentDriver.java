/**
	* A class to test our Student class.
**/
public class StudentDriver {

	public static void main(String[] args) {


		Student s1 = new Student("Bob", "Smith", 1234, "Math");
		
		Student s2 = new Student("Sally", "Jones", 1234, "Math");


		System.out.println(s1.toString());
		System.out.println("*************");

		s1.getName().setFirstName("Robert");
		System.out.println(s1.toString());
		System.out.println("*************");



		s1.changeFirstName("Bob");
		System.out.println(s1.toString());
		System.out.println("*************");


		// s2 = s1;

		// if(s1.getName().equals(s2.getName())) { //s1 == s2
		// 	System.out.println("SAME!");
		// } else {
		// 	System.out.println("DIFFERENT!");
		// }
		// if(s1.equals(s2)) { //s1 == s2
		// 	System.out.println("SAME!");
		// } else {
		// 	System.out.println("DIFFERENT!");
		// }

		// s1.setName("Robert Smith");

		// System.out.println(s2.toString());

		// s1.incrementMissedDays(5);
		// System.out.println("*************");
		// System.out.println(s1.toString());


		// s2.setMajor("History");
		// System.out.println("*************");
		// System.out.println(s2.toString());

		// // String getNameResult = s1.getName();
		// System.out.println("*************");
		// System.out.println(s1.getName());

	}

}