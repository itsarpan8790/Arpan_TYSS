package practiseAllSDET52;

public class PrakashSir_11jan {
	public static void main(String[] args) {
		String s = "abc@x%y$m";
		System.out.println(s);
		String str = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				str = str + s.charAt(i);
			}
		}
		//System.out.println(str);
		StringBuilder sb = new StringBuilder(str);
		StringBuilder rev = sb.reverse();
		//System.out.println(rev);

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '@'|| s.charAt(i) == '%'|| s.charAt(i) == '$')
				System.out.print(s.charAt(i));
			else
				System.out.print(rev.charAt(count++));
		}
	}
}
