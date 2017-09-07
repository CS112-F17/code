/**
	* A class that represents a full name.
**/
public class Name {
	
		private String firstName;
		private String lastName;

		public Name(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String toString() {
			return firstName + " " + lastName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		//It is advised to implement a .equals method!

}