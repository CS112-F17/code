/**
	* A class to say Hello, World!
	* @author srollins
**/
public class HelloWorld {
	
	/**
		* Main method.
	**/
	public static void main(String[] args) { 
		//updated example to show effect of pre- and post-increment operator
		int i = 0;
		System.out.println("Hello, world! " + i++);	

		//updated example to demonstrate when/why using .equals 
		//to compare objects is necessary 
		String s1 = new String("hello");
		String s2 = new String("hello");

		if(s1.equals(s2)) {
			System.out.println("SAME!");
		
		} else {
			System.out.println("DIFFERENT!");
		}


	}

}