package LearnArrayPrograms;

public class FirstMaxNoWithoutBubbleSort {
	public static void main(String[] args) {
		int[] ar = { 10, 20,15, 5, 20, 2, 3 };

		int max = ar[0];

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max)
				max = ar[i];
		}
		System.out.println("First max= " + max);

	}

}
