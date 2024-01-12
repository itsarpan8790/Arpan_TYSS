package ClassAssignment_08Dec;

public class Q6_PrimeNumInArray {
	public static void main(String[] args) {
		int[] ar = { 7, 4, 2, 1, 5, 9, 8, 3 };

		for (int i = 0; i < ar.length; i++) {
			int n=ar[i];//7
			int count = 0;
			for (int j = 1; j <=n; j++) { // ar[i]=7
				if (ar[i] % j == 0)
					count++;
			}
			if (count == 2)
				System.out.println(ar[i] + " is Prime ");
		}
	}

}
