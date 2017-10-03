/**
	A class to demonstrate scope.

**/public class ScopeExample {

	public static void method(int x) {
		x = x + 1;
		System.out.println("method - " + x);

	}

	public static void increment(int[] myArray) {
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = myArray[i]+1;
		}
	}

	public static void main(String[] args) {
		int[] intArray = {3, 4, 5, 6, 7};

		for(int i: intArray) {
			System.out.println(i);
		}
		increment(intArray);
		System.out.println("*******");		
		for(int i: intArray) {
			System.out.println(i);
		}

		// int x = 1;
		// System.out.println("main(1) - " + x);
		// method(x);
		// System.out.println("main(2) - " + x);


	}

}