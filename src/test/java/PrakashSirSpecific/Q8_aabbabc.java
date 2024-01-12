package PrakashSirSpecific;

public class Q8_aabbabc {
	public static void main(String[] args) {
		String s1 = "aabbabc"; // o/p-a2b2a1b1c1
		int count = 1;
		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.charAt(i) == s1.charAt(i + 1))
				count++;//2
			else {
				System.out.print(s1.charAt(i) + "" + count);
				count = 1;
			}
		}
		System.out.println(s1.charAt(s1.length() - 1) + "" + count);

		System.out.println("****************************");

		String s2 = "aabbabccc";
		int count1 = 1;
		for (int i = 0; i < s2.length() - 1; i++) {
			if (s2.charAt(i) == s2.charAt(i + 1))
				count1++;
			else {
				System.out.print(s2.charAt(i) + "" + count1);
				count1 = 1;
			}

		}
		System.out.println(s2.charAt(s2.length() - 1) + "" + count1);

	}

}
