public class RecursionFun {

	public static int factorialIterative(int n) {

		int product = 1;
		for(int i = n; i > 0; i--) {
			product = product * i;
		}
		return product;
	}


	public static int factorialRecursive(int n) {	

		if(n == 1) {
			return 1;
		}
		return n * (factorialRecursive(n-1));
	}

	public static void printString(String s) {
		//print the string s one character at a time one char on each line
		// if(s.length() == 1) {
		// 	System.out.println(s.charAt(0));
		// 	return;
		// }	

		if(s.length() == 0) {
			return;
		}		
		printString(s.substring(1));
		System.out.println(s.charAt(0));

	}

	public static int countAs(String s) {

		if(s.length() == 0) {
			return 0;
		}	

		// int count = 0;
		// if(s.charAt(0) == 'a') {
		// 	count++;
		// }
		// return count + countAs(s.substring(1));


		if(s.charAt(0) == 'a') {
			return 1 + countAs(s.substring(1));
		}
		return countAs(s.substring(1));

	}

	public static void printNums(int n) {

		printNums(0, n);

	}

	private static void printNums(int start, int end) {

		if(start == end) {
			System.out.println(end);
			return;
		}
		System.out.print(start);
		printNums(start+1, end);

	}

	public static boolean contains(String s, char target) {

		if(s.length() == 0) {
			return false;
		}	
		if(s.charAt(0) == target) {
			return true;
		}
		return contains(s.substring(1), target);

	}

	public static void main(String[] args) {
		// System.out.println(factorialRecursive(3));
		// printString("cat");
		// System.out.println(countAs("computer"));
		// printNums(3);
		// String s1 = "t";
		// System.out.println("s1.substring(1): " + s1.substring(1));
		// System.out.println("s1.substring(5): " + s1.substring(5));
	}


}