public abstract class USFPerson implements Comparable<USFPerson> {

	protected String name;
	protected int id;

	public USFPerson(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public String toString() {
		return name + " - " + id;
	}

	public abstract int getEmailQuota();

	public int compareTo(USFPerson other) {

		if(this.name.equals(other.getName())) {
			//compare ids
			return this.id - other.getId();
			//return result

		}
		return this.name.compareTo(other.getName());

	}

}