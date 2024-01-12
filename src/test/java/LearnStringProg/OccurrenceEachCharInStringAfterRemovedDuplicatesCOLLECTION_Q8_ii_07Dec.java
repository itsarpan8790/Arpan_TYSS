package LearnStringProg;

import java.util.LinkedHashSet;

public class OccurrenceEachCharInStringAfterRemovedDuplicatesCOLLECTION_Q8_ii_07Dec {
	public static void main(String[] args) {
		String str = "tester";
		// String s=str.toLowerCase();

		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();

		// RemovingDuplicates
		for (int i = 0; i < str.length(); i++) {
			lhs.add(str.charAt(i));
		}

		// Comparing and counting
		for (Character ob : lhs) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (ob == str.charAt(i))
					count++;
			}
			System.out.println(ob + " -->" + count);
//			if(count>1) 
//				System.out.println(ob+" is duplicate");
//				else
//					System.out.println(ob+" is not duplicate");
					
			}
		}
}


