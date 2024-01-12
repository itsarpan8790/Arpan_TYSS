package ClassAssignment_08Dec;
import java.util.TreeSet;

public class Q7_PrintSmallestEvenInArray {
	public static void main(String[] args) {
		int[] ar = { 5, 3, 2, 1, 8, 7 };
		TreeSet<Integer> tset = new TreeSet<Integer>();
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0)
				tset.add(ar[i]);

		}
		System.out.println("Min even element " + tset.first());
	}

}
