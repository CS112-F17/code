/**
	* A class that represents a full name.
**/
public class Name implements Comparable<Name>, Viewable {
	
		private String firstName;
		private String lastName;

		public Name(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String toString() {
			return firstName + " " + lastName;
		}

		public String getLastName() {
			return this.lastName;
		}

		public String getFirstName() {
			return this.firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		//sort by last name first
		public int compareTo(Name n) {

			//if lastnames are the same
			// return the result of comparing the first names
			//else return the result of comparing the last names

			if(this.lastName.compareTo(n.getLastName()) == 0) {
				return this.firstName.compareTo(n.getFirstName());
			} 
			return this.lastName.compareTo(n.getLastName());
			

		}

		public void display() {
			System.out.println(toString());
		}

		//It is advised to implement a .equals method!

}