package Mock;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class W1E2L1C1O1M1 {
	public static void main(String[] args) {
		String s = "welcome";
		//s.split(s)

		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (lhm.containsKey(s.charAt(i)))
				lhm.put(s.charAt(i), lhm.get(s.charAt(i)) + 1);
			else
				lhm.put(s.charAt(i), 1);

		}
		
		for(Entry<Character, Integer> set:lhm.entrySet()) {
			System.out.print(set.getKey()+""+set.getValue());
		}
		//div[@id='variation_color_name']//img[contains(@src,'https://m.media-amazon.com/images/I/')]
	}

}
