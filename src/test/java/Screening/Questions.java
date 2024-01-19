package Screening;

import java.util.Iterator;

public class Questions {
	public static void main(String[] args) {
		// Find out if there are any occurrences of the word in a sentence using regex

		String s = "i love india so india loves me";
		String[] ar = s.split(" ");
		boolean[] flag = new boolean[ar.length];


		for (int i = 0; i < ar.length; i++) {
			if (flag[i] == false) {
				
				String f=ar[i];
				int count = 0;
				for (int j = 0; j < ar.length; j++) {
					if (f.equals(ar[j])) {
						count++;
						flag[j] = true;
					}

				}

				if(count>1) {
					System.out.println(f + " occurs " +count+" times");
				}

			}

		}
	}

}
