package practiseAllSDET52;

public class FmaxSmaxSingleForloop {
	public static void main(String[] args) {
		int[] ar = { 2, 1, 3, 4, 5, 6, 7, 8 };

		int fmax = ar[0];// 2
		int smax = ar[1];// 1

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > fmax) {
				smax = fmax;
				fmax = ar[i];
			} else {
				smax = ar[i];
				fmax = smax;
			}

		}
		System.out.println(fmax + " " + smax);
	}
}
