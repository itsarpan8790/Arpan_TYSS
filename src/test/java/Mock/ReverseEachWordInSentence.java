package Mock;

public class ReverseEachWordInSentence {
	public static void main(String[] args) {
		String str = "my name is kiran";
		String[] s = str.split(" ");

		for (int i = 0; i < s.length; i++) {
			String n = s[i];// my
			for (int j = n.length() - 1; j >= 0; j--) {
				System.out.print(n.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
