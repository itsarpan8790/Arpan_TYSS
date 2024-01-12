package LearnStringProg;

public class MinLengthValueInStringArray_08Dec {
	public static void main(String[] args) {
		String[] ar = { "ab", "abc", "abcd", "ef", "edcf" };

		String minEle = ar[0];
		// For Minimum
		for (int i = 0; i < ar.length; i++) {

			if (minEle.length() > ar[i].length())
				minEle = ar[i];
		}

		for (int i = 0; i < ar.length; i++) {
			if (ar[i].length() == minEle.length())
				System.out.println(ar[i] + " ");
		}

		System.out.println("***********************");
		// For Maximum
		String maxEle = ar[0];
		for (int i = 0; i < ar.length; i++) {

			if (maxEle.length() < ar[i].length())
				maxEle = ar[i];
		}

		for (int i = 0; i < ar.length; i++) {
			if (ar[i].length() == maxEle.length())
				System.out.println(ar[i] + " ");
		}
	}

}
