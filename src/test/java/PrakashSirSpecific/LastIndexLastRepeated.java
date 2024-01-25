package PrakashSirSpecific;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class LastIndexLastRepeated {

	@Test
	public void main1() {
		int a[] = { 4, 6, 7, 8, 6, 10, 8, 8 };

		ArrayList list = new ArrayList();

		for (int i = 0; i < a.length; i++) {

			if (list.contains(a[i])) {
				System.out.println(a[i] + "repeated at index " + i);
			} else {
				list.add(a[i]);
			}
		}

	}

	@Test
	public void main2() {
		int a[] = { 4, 6, 7, 8, 6, 10, 8, 8 };
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (i < j) {
						System.out.print((j + 1));
						break;

					}
				}
			}
		}
	}


}
