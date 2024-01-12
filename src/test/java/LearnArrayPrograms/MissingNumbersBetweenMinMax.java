package LearnArrayPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class MissingNumbersBetweenMinMax {
	public static void main(String[] args) {
		int[] ar = { 10, 15, 5, 20, 2, 3 };

		TreeSet<Integer> tset = new TreeSet<Integer>();
		for (int i = 0; i < ar.length; i++) {
			tset.add(ar[i]);
		}
		for (Integer set : tset) {
			System.out.print(set + " ");
		}
		System.out.println();
		int min = tset.first();
		int max = tset.last();
		System.out.println("Minimum--> " + min);
		System.out.println("Maximum--> " + max);

		ArrayList<Integer> misAL = new ArrayList<Integer>();

		for (int i = min; i <= max; i++) {// 2-20
			misAL.add(i);

		}

		for (Integer al : misAL) {
			for (int i = 0; i <= ar[i]; i++) {
				if(al!=ar[i])
					System.out.println(al);

			}

		}

	}
}
