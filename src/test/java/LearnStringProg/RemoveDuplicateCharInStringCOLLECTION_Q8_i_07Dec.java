package LearnStringProg;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharInStringCOLLECTION_Q8_i_07Dec {
	
	public static void main(String[] args) {
		String str="tester";
		//String s=str.toLowerCase();
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		
		//RemovingDuplicates
		for (int i = 0; i < str.length(); i++) {
			lhs.add(str.charAt(i));
		}
			for(Character l:lhs) {
				System.out.println(l);
			}
	}

}
