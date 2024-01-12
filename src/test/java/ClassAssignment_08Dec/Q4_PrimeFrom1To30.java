package ClassAssignment_08Dec;

public class Q4_PrimeFrom1To30 {
	public static void main(String[] args) {

		int start = 1;
		int end = 30;

		for (int j = start; j <= end; j++) {

			int count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0)
					count++;
			}
			if (count == 2)
				System.out.println(j + " is Prime number");
			else
				System.out.println(j + " is not Prime number");

		}

	}

}
