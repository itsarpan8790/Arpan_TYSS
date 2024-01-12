package LearnStringProg;

public class SumOfDigitsInString_08Dec {
	public static void main(String[] args) {
		String str = "a2b4c6";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9')
				sum = sum + ch - 48;
		}
		System.out.println("sum of digits in string is "+sum);
		
//		String s="abc";
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			int c=ch;
//			
//		}
	}

}
