package ClassAssignment_08Dec;

public class Q3_FactorialOfANumber {
	public static void main(String[] args) {
		int n = 5;
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

	}
}
