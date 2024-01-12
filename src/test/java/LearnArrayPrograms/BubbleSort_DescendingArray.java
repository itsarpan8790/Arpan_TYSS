package LearnArrayPrograms;

public class BubbleSort_DescendingArray {
	public static void main(String[] args) {
		int[] ar = { 65, 15, 35, 5, 25, 37, 13 };
//at every one Swap-->inner loop ends--next outer loop starts
		int temp = 0;

		for (int i = 0; i < ar.length; i++) {
			//System.out.println(i + " iter " + ar[i]);
			for (int j = 0; j < ar.length - 1; j++) {

				if (ar[i] > ar[j]) {
					// System.out.println(" ar[i] " + ar[i]);
					temp = ar[i];
					// System.out.println("temp " + temp);
					ar[i] = ar[j];
					// System.out.println("ar[i]" + ar[i]);
					ar[j] = temp;
					// System.out.println("ar[i]" + ar[j]);
				}
//				for (int k = 0; k < ar.length; k++) {
//					System.out.print(ar[k] + " ");
			}
			//System.out.println();

		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		 System.out.println();

		System.out.println("Max no is " + ar[0]);
		System.out.println("Min No is  " + ar[ar.length - 1]);
	}

}
