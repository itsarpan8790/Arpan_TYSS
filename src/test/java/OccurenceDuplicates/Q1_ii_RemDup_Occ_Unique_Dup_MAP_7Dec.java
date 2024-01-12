package OccurenceDuplicates;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Q1_ii_RemDup_Occ_Unique_Dup_MAP_7Dec {
	public static void main(String[] args) {
		int[] a = {  4, 4, 2, 5, 5, 4, 2, 1,5 };

		LinkedHashMap<Integer, Integer> lhmap = new LinkedHashMap<Integer, Integer>();
		// Step 1.Addingto map to remove duplicates
		// Step 2.Taking count as occurence as Values and incrementing in if block
		for (int i = 0; i < a.length; i++) {

			if (lhmap.containsKey(a[i]))
				lhmap.put(a[i], lhmap.get(a[i]) + 1);
			else
				lhmap.put(a[i], 1);

		}
		// Step 3. Printing occurence
		for (Entry<Integer, Integer> map : lhmap.entrySet()) {
			System.out.println(map.getKey() + " occurs " + map.getValue() + " times");
		}

		// Step 4.Printing Unique and Duplicates
		for (Entry<Integer, Integer> map : lhmap.entrySet()) {
			if (map.getValue() > 1)
				System.out.println(map.getKey() + " is duplicated ");
			else
				System.out.println(map.getKey() + " is unique ");

		}
		System.out.println("*********************************");
		
		// Step 5.Way 1- Printing highest occured Key 
		int maxOccurVal = 0;
		int maxOccurKey = 0;
		for (Entry<Integer, Integer> map : lhmap.entrySet()) {
			if (map.getValue() >= maxOccurVal && map.getKey() > maxOccurKey) {
				maxOccurVal = map.getValue();
				maxOccurKey = map.getKey();
			}
		}
		System.out.println(maxOccurKey + "-->" + maxOccurVal);
		
		// Step 6.Way 2- Printing highest occured Key 
				int maxVal = 0;
				int maxKey = 0;
				for (Entry<Integer, Integer> map : lhmap.entrySet()) {
					
					if (map.getValue() >= maxOccurVal && map.getKey() > maxOccurKey) {
						maxOccurVal = map.getValue();
						maxOccurKey = map.getKey();
					}
				}
				System.out.println(maxOccurKey + "-->" + maxOccurVal);

	}

}
