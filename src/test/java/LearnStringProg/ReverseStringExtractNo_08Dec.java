package LearnStringProg;

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
			System.out.print(st[i]+" ");

		}
	}
}
