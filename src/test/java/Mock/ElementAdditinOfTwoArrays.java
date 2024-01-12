package Mock;

public class ElementAdditinOfTwoArrays {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 2, 4, 6, 8 };

		int bigger=a1.length;
		if (a1.length<a2.length)
			bigger=a1.length;
		
		for (int i = 0; i < bigger; i++) {

			try {
				System.out.println(a1[i]+a2[i]);
			}
			catch(Exception e){
				if(a1.length>=bigger)
					System.out.println(a1[i]);
				else
					System.out.println(a2[i]);
			}
		}
	}

}
