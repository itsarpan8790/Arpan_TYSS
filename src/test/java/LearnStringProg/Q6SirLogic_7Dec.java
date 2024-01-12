package LearnStringProg;

public class Q6SirLogic_7Dec {
	public static void main(String[] args) {
		String mstr = "Tester";
		String str = mstr.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					if (i > j)
						break;
					else
						count++;
				}

			}
			if(count>=1)
				System.out.println(str.charAt(i)+" "+count);

		}
	}

}
