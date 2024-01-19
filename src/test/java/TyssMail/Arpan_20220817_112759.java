package TyssMail;

import org.testng.annotations.Test;

public class Arpan_20220817_112759 {
	@Test
	public void caseConversion() {
		String s = "AbcDFGsgh";
		String upper = "";
		String lower = "";
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
				upper = upper + s.toLowerCase().charAt(i);

			else
				lower = lower + s.toUpperCase().charAt(i);

		}
		System.out.println(upper + " " + lower);
	}

	@Test
	public void caseConversion1() {
		String s = "rishavSINGH";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				char ch = (char) (s.charAt(i) + 32);
				rev = rev + ch;
			} else {
				char ch = (char) (s.charAt(i) - 32);
				rev = rev + ch;
			}

		}
		System.out.println(rev);

	}

	@Test
	public void mergeArray() {
		int ar1[] = { 1, 2, 3 };
		int ar2[] = { 4, 5, 6, 7 };
		int ar3[] = new int[ar1.length + ar2.length];

		int count = 0;

		for (int i : ar1) {
			ar3[count++] = i;
		}

		for (int j : ar2) {
			ar3[count++] = j;
		}

		// printing
		for (int k : ar3) {
			System.out.print(k + " ");
		}
	}
}
