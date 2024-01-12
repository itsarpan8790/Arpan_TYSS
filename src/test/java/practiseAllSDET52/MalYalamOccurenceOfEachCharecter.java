package practiseAllSDET52;

import java.util.LinkedHashSet;

public class MalYalamOccurenceOfEachCharecter {
	public static void main(String[] args) {
		String s = "malyalam";
		LinkedHashSet<Character> lset = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			lset.add(s.charAt(i));
		}

		for (Character set : lset) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (set == s.charAt(i))
					count++;
			}
			System.out.print(set + "" + count);
		}
	}
}
