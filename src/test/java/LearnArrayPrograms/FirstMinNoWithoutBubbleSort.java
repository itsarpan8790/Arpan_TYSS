package LearnArrayPrograms;

public class FirstMinNoWithoutBubbleSort {
	public static void main(String[] args) {
		int[] ar = { 10, 15, 5, 20, 2, 3 };

		int min = ar[0];

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min)
				min = ar[i];
		}
		System.out.println("First minimum = " + min);

	}

}
