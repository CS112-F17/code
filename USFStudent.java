public class USFStudent extends USFPerson {

	private double gpa;
	private String major;

	public USFStudent(String name, int id, double gpa, String major) {
		super(name, id);
		this.gpa = gpa;
		this.major = major;
	}


	public int getEmailQuota() {
		return 55;
	}

	public double getGpa() {
		return gpa;
	}

	public String toString() {
		String superStr = super.toString();
		return superStr + " - " + gpa + " - " + major;
	}

}