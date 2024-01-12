package InterviewSet85Questions;

public class Q24_aabcbbdeaa_ {
	public static void main(String[] args) {
		String s = "aabcbbdeaa";

		
		for (int i = 0; i < s.length() - 1; i++) {
			if (i != s.length() - 1) {
				System.out.print(s.charAt(i) + "" + s.charAt(i + 1));
				System.out.print(" ");
			}

		}

	}

}
