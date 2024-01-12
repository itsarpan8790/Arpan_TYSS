package LearnDebugging;

public class Recursion {

	public static void main(String[] args) {
		String s = "india";

		int lastIndex = s.length() - 1;
		reverse(s, lastIndex);

		System.out.println();
	}

	public static void reverse(String s, int lastIndex) {
		if (lastIndex >= 0) {
			System.out.print(s.charAt(lastIndex));
			// lastIndex--;
			reverse(s, --lastIndex);
		}

	}

}
