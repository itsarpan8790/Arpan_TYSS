package LearnStringProg;

import java.util.LinkedHashSet;

public class PrintVowelWithoutDuplicates_Q11_07Dec {
	public static void main(String[] args) {
		String str = "educationindia";

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			set.add(c);
		}
		int count = 0;
		for (Character c : set) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
				System.out.println(c);
			}
		}
		System.out.println("no of vowels are " + count);

	}

}
