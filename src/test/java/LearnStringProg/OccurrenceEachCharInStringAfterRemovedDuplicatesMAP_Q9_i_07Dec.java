package LearnStringProg;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OccurrenceEachCharInStringAfterRemovedDuplicatesMAP_Q9_i_07Dec {

	public static void main(String[] args) {
		String str = "tester";
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			if (hm.containsKey(str.charAt(i)))
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			else
				hm.put(str.charAt(i), 1);
		}
		for (Entry<Character, Integer> map : hm.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}

	}

}
