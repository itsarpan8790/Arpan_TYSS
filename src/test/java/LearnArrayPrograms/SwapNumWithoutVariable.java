package LearnArrayPrograms;

public class SwapNumWithoutVariable {
	public static void main(String[] args) {
		int[] ar = { 20, 30 };

		ar[0] = ar[0] + ar[1];
		ar[1] = ar[0] - ar[1];
		ar[0] = ar[0] - ar[1];

		System.out.println(ar[0] + "  " + ar[1]);

	}

}
