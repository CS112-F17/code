public class Faculty extends USFPerson {

	private int salary;

	public Faculty(String name, int id, int salary) {
		super(name, id);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public String toString() {
		return name + " - " + id + " $" + salary;
	}

	public int getEmailQuota() {
		return 99;
	}

}
