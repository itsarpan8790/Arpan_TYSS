package Mock;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintVowelsUsingMap_FinalMock {

	public static void main(String[] args) {
		String str = "iloveindia";
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				s = s + ch;
			}
		}
		

		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (hmap.containsKey(s.charAt(i)))
				hmap.put(s.charAt(i), hmap.get(s.charAt(i)) + 1);
			else
				hmap.put(s.charAt(i), 1);
		}

		for (Entry<Character, Integer> map : hmap.entrySet()) {
			System.out.print(map.getKey() );
		}

	}

}
