package ClassAssignment_08Dec;

public class Q1_IntegerPallindrome {
	public static void main(String[] args) {
		int n = 1221, temp = n, rev = 0;
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}

		n = temp;
		for (int i = 1; i <= count; i++) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;

		}

		if (temp == rev)
			System.out.println(temp + " is Palindrome");
		else
			System.out.println(temp + " is not Palindrome");
	}
}
