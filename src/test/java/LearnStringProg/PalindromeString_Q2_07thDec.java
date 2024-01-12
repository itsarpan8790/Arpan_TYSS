package LearnStringProg;

public class PalindromeString_Q2_07thDec {
	public static void main(String[] args) {
		String str = "malayalam";
		String rev = "";
		char[] c = str.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];

		}

		if (str.equalsIgnoreCase(rev))
			System.out.println(str + " is Pallindrome");
		else
			System.out.println(str + " is not Pallindrome");

	}

}
