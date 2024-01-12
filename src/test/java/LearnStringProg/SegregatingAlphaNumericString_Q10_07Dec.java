package LearnStringProg;

public class SegregatingAlphaNumericString_Q10_07Dec {
	public static void main(String[] args) {
		String str = "a1c$d3R%^";
		String alpha = "";
		String spc = "";
		String num = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'B')
				alpha = alpha + c;
			else if (c >= '0' && c <= '9')
				num = num + c;
			else
				spc = spc + c;
		}
		System.out.println(alpha + num + spc);
	}

}
