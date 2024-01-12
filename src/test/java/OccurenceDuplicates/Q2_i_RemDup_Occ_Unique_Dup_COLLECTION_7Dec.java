package OccurenceDuplicates;

import java.util.LinkedHashSet;

public class Q2_i_RemDup_Occ_Unique_Dup_COLLECTION_7Dec {
	public static void main(String[] args) {
		String str = "hi hello hi hello welcome";
		String[] ar = str.split(" ");

		LinkedHashSet<String> lset = new LinkedHashSet<String>();
		// Step 1.Adding to set to Remove Duplicates.
		for (int i = 0; i < ar.length; i++) {
			lset.add(ar[i]);

		}
		// Printing Set
		for (String s : lset) {
			System.out.print(s + " ");

		} 
		System.out.println("");

		// Step 2.Checking Occurence
		for (String s : lset) {
			int count = 0;
			for (int i = 0; i < ar.length; i++) {
				if (s.equals(ar[i])) {
					count++;
				}
			}
			// Step 3.Prinnting Occurence
			//System.out.println(s + " occurs " + count + " times ");

			// Step 4.Printing Unique and Duplicates
			if(count>1)
				System.out.println(s+" is duplicated repeated "+count+ " times");
			else
				System.out.println(s+" is unique");

		}
	}
}
