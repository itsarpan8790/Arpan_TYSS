package Mock;

public class MaxOccurence_FinalMock {

	public static void main(String[] args) {
		int[] ar = { 5, 5, 5, 5, 4, 3, 2, 1, 4, 2, 4, 5 };
		boolean[] flag = new boolean[ar.length];
		int max = 0, value = 0;

		for (int i = 0; i < ar.length; i++) {

			if (flag[i] == false) {
				int count = 0;
				for (int j = 0; j < ar.length; j++) {
					if (ar[i] == ar[j]) {
						count++;
						flag[j] = true;
					}
				}
				if (count > max) {
					max = count;
					value = ar[i];
				}

			}

		}

		System.out.println(value + " occured max " + max + " times");

	}

}
