package ClassAssignment_08Dec;

public class Q2_FibonacciSeries {
	public static void main(String[] args) {
		int n = 10;
		
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;

		System.out.print(0+" ");
		while (n > 0) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			n--;
			System.out.print(f1 + " ");
		}

	}

}
