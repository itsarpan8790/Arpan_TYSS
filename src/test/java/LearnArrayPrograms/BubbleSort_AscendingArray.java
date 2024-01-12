package LearnArrayPrograms;

public class BubbleSort_AscendingArray {
	public static void main(String[] args) {
		int[] ar = { 4, 3, 2, 1 };
		int temp = 0;
		int length = ar.length;
		for (int i = 0; i < ar.length; i++) {

			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}

		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		System.out.println("Min no is " + ar[0]);
		System.out.println("Max No is  " + ar[length - 1]);
		// Sum of first 3 no in array
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + ar[i];

		}
		System.out.println("Sum of 1st 3 = " + sum);

		// product of first 3 no in array
		int product = 1;
		for (int i = 0; i < 3; i++) {
			product = product * ar[i];

		}
		System.out.println("product of 1st 3 = " + product);

	}

}
