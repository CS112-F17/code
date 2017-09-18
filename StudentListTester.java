/**
	A class to test StudentList during development.
**/
public class StudentListTester {

	public static void main(String[] args) {

		StudentList sl = new StudentList();

		Student s1 = new Student("Bob", 1234);
		s1.incrementMissedDays();
		s1.incrementMissedDays();
		s1.incrementMissedDays();
		Student s2 = new Student("Sally", 2345);
		s2.incrementMissedDays();
		s2.incrementMissedDays();
		s2.incrementMissedDays();
		s2.incrementMissedDays();
		Student s3 = new Student("Herb", 3456);
		s3.incrementMissedDays();
		s3.incrementMissedDays();

		sl.addStudent(s1);
		sl.addStudent(s2);
		sl.addStudent(s3);

		System.out.println(sl.mostMissedDays());


	}
}