package PrakashSirSpecific;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "amma";
		String s2 = "mama";
		String[] ar1 = s1.split("");
		String[] ar2 = s2.split("");
		Arrays.sort(ar1);
		Arrays.sort(ar2);

		if (s1.length() == s2.length()) {
			Arrays.equals(ar1, ar2);
			System.out.println("Anagram");
		} else {
			System.out.println(" Not Anagram");
		}
	}

}
