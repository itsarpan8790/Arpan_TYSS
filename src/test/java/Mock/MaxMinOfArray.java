package Mock;

public class MaxMinOfArray {
	public static void main(String[] args) {
		int[] a = { 4, 5, 3, 2, 7, 1 };

		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
			else if (a[i] < max)
				min = a[i];

		}
		System.out.println(max+" "+min);
	}

}
