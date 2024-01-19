package LearnArrayPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class MissingNumbersBetweenMinMax {
	public static void main(String[] args) {
		// int[] ar = { 10, 15, 5, 20, 2, 3 };
		int[] ar = { 1, 5 };
		Arrays.sort(ar);

		int fnum = ar[0];// 1
		int snum = ar[ar.length - 1];// 5
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();

		for (int i = fnum; i <= snum; i++) {
			hs.add(fnum++);

		}
		for (int h : hs) {
			System.out.println("Hashset>>" + h);
		}
		
		

	}
}
