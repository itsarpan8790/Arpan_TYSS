package OccurenceDuplicates;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Q2_ii_RemDup_Occ_Unique_Dup_MAP_7Dec {
	public static void main(String[] args) {
		String str = "hi hello hi hello welcome";

		String[] ar = str.split(" ");

		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();

		// Adding ar[] elements to mapKEY
		// Adding ar[] count as mapVALUE
		for (int i = 0; i < ar.length; i++) {
			if (tmap.containsKey(ar[i]))
				tmap.put(ar[i], tmap.get(ar[i]) + 1);
			else
				tmap.put(ar[i], 1);

		}

		// Printing Occurence
		for (Entry<String, Integer> map : tmap.entrySet()) {
			System.out.println(map.getKey() + " occurs " + map.getValue() + " times");

		}

		// Printing Unique and Duplicates
		for (Entry<String, Integer> map : tmap.entrySet()) {
			if (map.getValue() > 1)
				System.out.println(map.getKey() + " is duplicated ");
			else
				System.out.println(map.getKey() + " is unique ");
		}

	}

}
