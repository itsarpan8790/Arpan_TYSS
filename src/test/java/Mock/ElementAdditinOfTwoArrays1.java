package Mock;

public class ElementAdditinOfTwoArrays1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 4, 6, 8, 5, 65 };

		int bigger = a.length;
		if (a.length > b.length)
			bigger = a.length;

		for (int i = 0; i < bigger; i++) {

			try {
				System.out.println(a[i] + b[i]);
			} catch (Exception e) {
				if (a.length == bigger)
					System.out.println(a[i]);
				else
					System.out.println(b[i]);
			}
		}
	}

}
