/**
	A class to test the NumberList.
**/
public class NumberListTester {

	public static void main(String[] args) {
		NumberList nl = new NumberList();
		nl.addFirst(5);
		nl.addFirst(17);
		nl.addFirst(39);
		System.out.println(nl);
	}
}