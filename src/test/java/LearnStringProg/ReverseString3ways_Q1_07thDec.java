package LearnStringProg;

public class ReverseString3ways_Q1_07thDec {
	public static void main(String[] args) {
		String str = "Software";
		String rev1 = "";

		// 1st Way
		System.out.println("First Way :Reversed using Variable");
		for (int i = str.length() - 1; i >= 0; i--) {

			rev1 = rev1 + str.charAt(i);
		}
		System.out.println(rev1);

		// 2nd Way
		System.out.println("2nd way:Reversed using split()");
		String rev2 = "";
		String[] ar = str.split("");

		for (int i = ar.length - 1; i >= 0; i--) {
			rev2 = rev2 + ar[i];
		}
		System.out.println(rev2);

		// 3rd Way
		System.out.println("3rd way :Reversed using String Builder");
		StringBuilder sb = new StringBuilder(str);
		StringBuilder rev3 = sb.reverse();
		System.out.println(rev3);

		// 4th way
		System.out.println("4th way :Reversed using toCharArray()");
		String rev4 = "";
		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			rev4 = rev4 + ar[i];
		}
		System.out.println(rev4);
	}

}
