package LearnArrayPrograms;

public class SortAllZerosToRight_Pending {
	public static void main(String[] args) {
		int[] ar = { 5, 0, 4, 0, 0, 9 };

		int count = ar.length - 1;// 5
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				temp = ar[i];
				ar[i] = ar[count];
				ar[count] = temp;
				count--;
			}

		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
