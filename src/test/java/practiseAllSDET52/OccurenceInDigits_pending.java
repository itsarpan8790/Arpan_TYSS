package practiseAllSDET52;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class OccurenceInDigits_pending {
	@Test
	public void main() {
		// int digit = 1122123111;
		int digit = 123;
		int temp = digit, digitCount = 0;
		int temp1 = digit;

		// Counting No of digits
		while (digit > 0) {
			digit = digit / 10;
			digitCount++;
		}

		boolean[] flag = new boolean[digitCount];

		for (int i = 1; i <= digitCount; i++) {

			// if (flag[i] == false) {

			int r = temp1 % 10;// 2
			int count = 0;
			temp = temp1;
			for (int j = digitCount; j >= 1; j++) {
				if (r == temp % 10) { // 3==3
					count++;// 1
					// flag[j] = true;

				}
				temp = temp / 10;// 12
			}
			System.out.println(r + "-" + count + ",");
			temp1 = temp1 / 10;
			// }

		}

	}

	@Test
	public void main2() {
		int digit = 3213, temp = digit;
		int digitCount = 0;
		while (digit > 0) {
			digit = digit / 10;
			digitCount++;
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (digit > 0) {
			al.add(digit / 10);
		}
		boolean[] flag = new boolean[digitCount];

		for (int i = al.size(); i >= 0; i++) {
			if (flag[i] == false) {
				int count = 0;
				int r=0;
				for (int j = al.size(); j >= 0; j++) {
					 r = temp % 10;
					if (al.get(i) == r) { // i=3 r=3
						count++;
						flag[j] = true;
					}
					temp = temp / 10;

				}
				System.out.println(r+" "+count);
			}
		}

	}
}
