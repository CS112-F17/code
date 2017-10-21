public class InheritanceTest {

	public static void main(String[] args) {


		USFPerson p = new Faculty("Bob", 1234, 90000);

		if(p instanceof Faculty) {
			Faculty f = (Faculty)p;
			System.out.println(f.getSalary());
		}

		// p = new USFStudent("Andy", 9866, 3.67, "History");


	}




}