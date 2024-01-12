package LearnStringProg;

public class ReverseEachWordSentence_Q4_07thDec {
	public static void main(String[] args) {
		String str = "i am software engineer";

		String[] ar = str.split(" ");

		for (int i = 0; i < ar.length; i++) {

			for (int j = ar[i].length() - 1; j >= 0; j--) {
				System.out.print(ar[i].charAt(j));

			}
			System.out.print(" ");

		}

	}

}
