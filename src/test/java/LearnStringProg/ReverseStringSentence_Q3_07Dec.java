package LearnStringProg;

public class ReverseStringSentence_Q3_07Dec {

	public static void main(String[] args) {
		String str = "i am software engineer";
		String rev = "";
		String[] ar = str.split(" ");

		for (int i = ar.length - 1; i >= 0; i--) {
			rev = rev + ar[i] + " ";

		}
		System.out.println(rev.trim());

	}

}
