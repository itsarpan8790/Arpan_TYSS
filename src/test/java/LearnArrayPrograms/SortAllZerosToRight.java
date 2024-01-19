package LearnArrayPrograms;

public class SortAllZerosToRight {
	public static void main(String[] args) {
		int[] ar = { 5, 0, 4, 0, 0, 9 };
		

		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] == 0) {
				for (int j = i; j < ar.length; j++) {
					if (ar[j] != 0) {
						int temp = ar[j];
						ar[j] = ar[i];
						ar[i] = temp;
					}
				}
			}

		}
		for (int a : ar) {
			System.out.print(a);
		}

	}

}
