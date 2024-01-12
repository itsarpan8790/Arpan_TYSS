package LearnDebugging;

public class Debugging1 {
	public static void main(String[] args) {
		System.out.println("Start");

		int a = 10;
		int b = 20;
		int sum = 0;

		sum(a, b);
		System.out.println(sum);
		System.out.println("end");

	}

	public static int sum(int a, int b) {
		System.out.println("sum function started");
		int res = a + b;

		System.out.println("sum function ended");
		return res;
	}

}
