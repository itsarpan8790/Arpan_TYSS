package Mock;

import java.util.LinkedHashSet;

public class Selnium {
	public static void main(String[] args) {
		String s="selenium";
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			lhs.add(s.charAt(i));
		}
		
		for(Character set:lhs) {
			System.out.print(set);
		}
	}

}
