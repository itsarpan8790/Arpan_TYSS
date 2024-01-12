package ClassAssignment_08Dec;

public class Q5_IsPrime {
	public static void main(String[] args) {
		int n = 10;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println(n + " is Prime number");
		else
			System.out.println(n + " is not Prime number");
	}

}
