package practiseAllSDET52;

public class SegregrateAlphanumeric_SanjaySir {
	public static void main(String[] args) {
		String s = "123abcjri67ABC"; // op-abc (if occurs two time print two time)
		String[] ar = s.split("[0-9]");
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].contains("abc"))
				count++;
			else if (ar[i].contains("ABC"))
				count++;

		}
		System.out.println("abc" + " occurs " + count);
	}
}
