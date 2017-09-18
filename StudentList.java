/**
	A class to store a list of students.
	@author srollins
**/
import java.util.ArrayList;

public class StudentList {

	//TODO: data members?
	private ArrayList<Student> students;

	/**
		Constructor with no parameters.
		It would also be possible to overload the constructor.
	**/
	public StudentList() {
		students = new ArrayList<Student>();
	}

	/**
		Add a new student to the list.
	**/
	public void addStudent(Student student) {
		students.add(student);		
	}

	/**	
		Return a string representation of the student who
		has missed the largest number of days.
	**/
	public String mostMissedDays() {

		//initialize to first item in the list!
		int mostMissed = students.get(0).getMissedDays();
		Student studentMostMissed = students.get(0);

		// for each student in the ArrayList
		// 	if that student's missed days is > mostMissed
		// 		update mostMissed to be this student's number of missed days
		// 		update studentMostMissed 

		for(Student s: students) {
			if(s.getMissedDays() > mostMissed) {
				mostMissed = s.getMissedDays();
				studentMostMissed = s;
			}
		}

		return studentMostMissed.toString();

	}

	/**
		Return a string representation of the full list.
	**/
	public String toString() {

		String result = "";
		for(Student s: students) {
			result = result + s.toString();
		}
		return result;

	}

}