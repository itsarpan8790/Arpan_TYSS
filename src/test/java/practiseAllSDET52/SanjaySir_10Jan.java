package practiseAllSDET52;

public class SanjaySir_10Jan {
	public static void main(String[] args) {

		String s = "india isxyz india";
		String str = s.replaceAll(" ", "");
		String[] ar = str.split("");

		boolean[] flag = new boolean[ar.length];
		String temp = "";
		for (int i = ar.length - 1; i >= 0; i--) {
			if (flag[i] == false) {
				int count = 0;
				String fc = ar[i];
				for (int j = ar.length - 1; j >= 0; j--) {
					if (fc.equals(ar[j])) {
						count++;
						flag[j] = true;
					}
				}
				if (count == 1)
					temp = temp + ar[i];

			}
		}
		System.out.println(temp);
	}

}
