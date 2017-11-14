import java.util.Arrays;

public class InheritanceTest {

	public static void main(String[] args) {


		USFStudent s = new USFStudent("Bob", 1234, 3.5, "History");
		USFPerson p = s;
		Comparable c = p;
		Object o = p;

		// USFStudent s2 = new USFStudent("Bob", 1234, 3.5, "History");

		System.out.println(p.show());


		// USFPerson[] people = new USFPerson[5];
		// people[0] = new USFStudent("Andy", 9866, 3.67, "History");
		// people[1] = new USFStudent("Shirley", 2233, 2.4, "Biology");
		// people[2] = new USFStudent("Shirley", 7645, 3.29, "Art");
		// people[3] = new Faculty("Bob", 1234, 90000);
		// people[4] = new Faculty("Javier", 2236, 180000);

		// Arrays.sort(people);

		// //may cause a ClassCastException!
		// // Faculty f = (Faculty)people[0];


		// for(USFPerson p: people) {
		// 	System.out.println(p);

		// 	if(p instanceof USFStudent) {

		// 		USFStudent s = (USFStudent)p;
		// 		//print GPA
		// 		System.out.println(s.getGpa());

		// 	} else if(p instanceof Faculty) {

		// 		Faculty f = (Faculty)p;
		// 		System.out.println(f.getSalary());
		// 	}
		// }


		// // USFPerson p = new USFStudent("Andy", 9866, 3.67, "History");
		// // System.out.println(p.getGpa());




		// // if(p instanceof Faculty) {
		// // 	Faculty f = (Faculty)p;
		// // 	System.out.println(f.getSalary());
		// // }

		// // p = new USFStudent("Andy", 9866, 3.67, "History");


	}




}