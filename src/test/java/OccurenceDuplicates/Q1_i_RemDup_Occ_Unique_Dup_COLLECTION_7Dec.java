package OccurenceDuplicates;

import java.util.LinkedHashSet;

public class Q1_i_RemDup_Occ_Unique_Dup_COLLECTION_7Dec {
	public static void main(String[] args) {
		int[] a = { 5, 4, 4, 2, 5, 4, 2, 1 };

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		// Step 1.Adding to set to Remove Duplicates.
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);

		}
		// Printing Set
		for (Integer s : set) {
			System.out.print(s + " ");
		}
		System.out.println("");

		// Step 2.Checking Occurence
		for (Integer s : set) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (s == a[i]) {
					count++;
				}
			}
			// Step 3.Prinnting Occurence
			// System.out.println(s+" occurs "+count+" times ");
			
			// Step 4.Printing Unique and Duplicates
			if (count > 1)
				System.out.println(s + " is duplicated repeated " + count + " times");
			else
				System.out.println(s + " is unique");

		}
	}

}
