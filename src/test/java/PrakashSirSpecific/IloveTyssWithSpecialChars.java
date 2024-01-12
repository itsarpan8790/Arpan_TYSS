package PrakashSirSpecific;

public class IloveTyssWithSpecialChars {
	public static void main(String[] args) {
		String s = "i@love%india$forever";
		System.out.println(s);
		String str = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				str = str + s.charAt(i);
			}
		}

		StringBuilder sb = new StringBuilder(str);
		StringBuilder rev = sb.reverse();

		int count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == '@'|| s.charAt(i) == '%'|| s.charAt(i) == '$')
//				System.out.print(s.charAt(i));
//			else
//				System.out.print(rev.charAt(count++));
//		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')

				System.out.print(rev.charAt(count++));
			else
				System.out.print(s.charAt(i));
		}
	}
}
