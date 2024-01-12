package practiseAllSDET52;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Q8_II_aabbabc {
	@Test
	public void main1() {
		String s1 = "aabbcccbbc";
		String s2 = "";
		int count = 1;
		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.charAt(i) == s1.charAt(i + 1))
				count++;// 2
			else {

				for (int j = 0; j < count; j++) {
					System.out.print(s1.charAt(i));
				}
				count = 1;
				System.out.println();
			}
		}

		for (int j = 0; j < count; j++) {
			System.out.print(s1.charAt(s1.length() - 1));
		}

	}

}
