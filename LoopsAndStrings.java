public class LoopsAndStrings {

	public static void main(String[] args) {

		String s = "hello\nclass\tit's only Monday!";
		int size = s.length();

		// System.out.println("length of string - " + s + " - is " + size);

		// System.out.println(s.charAt(2));

		int wscount = 0;

		for(int i = 0; i < size; i++) {
			char c = s.charAt(i);
			
			if(Character.isWhitespace(c)) {
				System.out.println("whitespace found at position: " + i);
				wscount++;
			}
		}

		System.out.println("whitespace count: " + wscount);

	}

}