/**
	Partial driver class.
**/
public class StudentDBDriver {

	public static void main(String[] args) {

		//use the default constructor to create a StudentListBuilder
		StudentListBuilder slb = new StudentListBuilder();
		//call the buildStudentList method and store the result
		//in a new StudentList variable.
		StudentList sl = slb.buildStudentList("students.txt");
		System.out.println(sl.toString());



	}
}