package LearnStringProg;

public class SwapFirstLastString_Q5_07Dec {
	public static void main(String[] args) {
		String str = "i am software engineer";
		String[] ar = str.split(" ");

		String temp = ar[0];
		ar[0] = ar[ar.length - 1];
		ar[ar.length - 1] = temp;

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");

		}
	}

}
