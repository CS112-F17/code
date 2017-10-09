import java.util.ArrayList;
/**
	A class to test the NumberList.
	**/
	public class NumberListTester {

		public static void main(String[] args) {
			NumberList nl = new NumberList();
			nl.addFirst(4);
			nl.addFirst(19);
			nl.addFirst(11);
			nl.addFirst(12);
			nl.addFirst(11);
			nl.addFirst(3);

			// try {

			// 	nl.removeFirst();
			// 	nl.removeFirst();
			// 	nl.removeFirst();
			// 	nl.removeFirst();
			// 	System.out.println("done with try block!");

			// } catch(EmptyListException ele) {
			// 	System.out.println(ele.getMessage());
			// } 

			// nl.addFirst(5);
			// System.out.println(nl);
			System.out.println(nl.find11s());
		}
	}