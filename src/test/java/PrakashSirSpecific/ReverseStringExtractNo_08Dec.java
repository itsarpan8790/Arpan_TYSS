package PrakashSirSpecific;

import org.testng.annotations.Test;

public class ReverseStringExtractNo_08Dec {

	@Test
	public void reverse() {
		String s = "Aabb1235dd45ee1ff44";

		String[] st = s.split("[A-Za-z]");

		for (int i = st.length - 1; i >= 0; i--) {
			System.out.print(st[i] + " ");

		}

	}

	@Test
	public void reverseExp() {
		String s = "Aabb1235dd45ee1ff44";

		String[] st = s.split("[A-Za-z]");

		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");

		}
	}

	@Test
	public void reverseExp1() {
		String s = "1Aabb1235dd45ee1ff44";

		String[] st = s.split("[A-Za-z]");
		System.out.print(st[st.length - 1]);
		for (int i = st.length - 2; i>=0; i--) {
			if (st[i].equals("")) {

			} else {
				System.out.print("," + st[i]);
			}

		}

	}
}
