/**
	* A poorly documented class that represents a Student.
	* Your code should have better documentation than this!
**/
public class Student {
	
	private Name name;
	private int id;
	private String major;
	private int missedDays;

	public Student(Name name, int id, String major) {
		this.name = name;
		this.id = id;
		this.major = major;
		this.missedDays = 0;
	}

	public Student(String first, String last, int id, String major) {
		this.name = new Name(first, last);
		this.id = id;
		this.major = major;
		this.missedDays = 0;
	}


	public Student(Name name, int id) {

		this.name = name;
		this.id = id;
		this.major = "Undeclared";
		this.missedDays = 0;
		// this(name, id, "Undeclared");		

	}

	public Student() {
		this(new Name("", ""), 0, "");
	}


	public Name getName() {
		return this.name;		
	}

	public int getId() {
		return this.id;
	}

	public String getMajor() {
		return this.major;		
	}

	public int getMissedDays() {
		return this.missedDays;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void incrementMissedDays() {
		this.missedDays++;		
	}

	public void incrementMissedDays(int numDays) {
		this.missedDays += numDays;
	}

	public String toString() {
		return "Name: " + name.toString() + "\nID: " + id + "\nMajor: " + major + " \nMissed Days: " + missedDays + "\n";
	}

	public boolean equals(Student other) {

		// if(this.name.equals(other.getName())) {
		// 	return true;
		// }
		// return false;

		// return this.name.equals(other.getName());

		if(this.name.equals(other.getName()) &&
			this.id == other.getId() &&
			this.major.equals(other.getMajor()) &&
			this.missedDays == other.getMissedDays()) {
			return true;
		}
		return false;

	}

	public void changeFirstName(String firstName) {
		name.setFirstName(firstName);
	}

}