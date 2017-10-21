public abstract class USFPerson {

	protected String name;
	protected int id;

	public USFPerson(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return name + " - " + id;
	}

	public abstract int getEmailQuota();

}