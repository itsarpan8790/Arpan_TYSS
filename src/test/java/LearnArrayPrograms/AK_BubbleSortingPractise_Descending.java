package LearnArrayPrograms;

public class AK_BubbleSortingPractise_Descending {
	public static void main(String[] args) {
		int[] ar = { 4, 3, 2, 1, 65, 43, 21, 83 };
		int temp = 0;
		int size = ar.length;
		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size - 1; j++) {//for (int j = 0; j < size -i- 1; j++)
				if (ar[j] < ar[j + 1]) {
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}

		}
		System.out.println("Afetr Sorting descending");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
