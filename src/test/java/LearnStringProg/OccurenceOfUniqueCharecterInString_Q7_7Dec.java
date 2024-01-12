package LearnStringProg;

public class OccurenceOfUniqueCharecterInString_Q7_7Dec {
	public static void main(String[] args) {
		String str = "tester";
		String[] ar = str.split("");
		boolean[] br = new boolean[ar.length];

		for (int i = 0; i < ar.length; i++) {
			if (br[i] == false) {
				String s = ar[i];// t
				int count = 0;
				for (int j = 0; j < ar.length; j++) {
					if (s.equals(ar[j])) {
						count++;
						br[j] = true;
					}

				}

				if (count == 1)
					System.out.println(ar[i] + " is unique");
				else
					System.out.println(ar[i] + " is duplicated");
			}

		}

	}
}
