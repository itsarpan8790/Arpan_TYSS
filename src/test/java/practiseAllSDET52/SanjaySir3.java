package practiseAllSDET52;

public class SanjaySir3 {
	public static void main(String[] args) {
		String s = "Tekion234inter52view54";// output 54,52,234

		String[] ar = s.split("[A-Za-z]");
		String str = "";
		String strf = "";
		for (int i = ar.length - 1; i >= 0; i--) {

			str = str + ar[i] + ",";

		}
		str.trim();
		System.out.println(str);
		
	}
}
