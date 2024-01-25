package myrandomPractises;

public class AllZerosToRight {
	public static void main(String[] args) {
		int ar[] = { 1, 0, 1, 1, 0, 1, 0, 0 };

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				for (int j = i; j < ar.length; j++) {
					if (ar[j] != 0) {
						int temp = ar[i];
						ar[i] = ar[j];
						ar[j] = temp;
					}
				}
			}
		}
		for(int a:ar) {
			System.out.print(a+" ");
		}
	}

}
