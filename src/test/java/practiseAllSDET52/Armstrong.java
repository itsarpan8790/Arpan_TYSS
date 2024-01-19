package practiseAllSDET52;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153, temp = num, temp2 = num;
		int exp = 0;
		int sum = 0;

		while (num > 0) {
			num = num / 10;
			exp++;
		}
		
		while (temp > 0) {
			int power = 1;
			int r = temp % 10;
			for (int i = 1; i <= exp; i++) {
				power = power * r;
			}
			sum = sum + power;
			temp = temp / 10;
		}
		if (temp2 == sum)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");

	}

}
