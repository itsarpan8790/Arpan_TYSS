package LearnArrayPrograms;

import org.testng.annotations.Test;

public class FirstMinandSecondMinOfArray {

	@Test(priority = 1)
	public void firstAndSecondMin() {
		int ar[] = { 4, 5, 6, 2, 3 };
		int fmin = ar[0];
		int smin = ar[0];
		int tmin = ar[0];

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < fmin)
				fmin = ar[i];
		}
		System.out.println("first minimum= " + fmin);

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > fmin) {
				for (int j = 0; j < ar.length; j++) {
					if (ar[i] < smin)
						smin = ar[i];
				}
			}
		}
		System.out.println("Second min = " + smin);

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > smin) {
				for (int j = 0; j < ar.length; j++) {
					if (ar[i] < smin)
						tmin = ar[i];
				}
			}
		}
		System.out.println("Third min = " + tmin);

	}

	@Test(priority = 2)
	public void firstAndSecondMax() {
		//int ar[] = { 10, 4, 5, 6, 1, 2, 3, 9, 8 };
		int ar[] = { 1, 4, 5, 6, 10, 2, 3, 9, 8 };
		int fmax = ar[0];
		int smax = ar[0];
		int tmax = ar[0];

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > fmax)
				fmax = ar[i];
		}
		System.out.println("first max= " + fmax);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] < fmax && ar[i] > smax) {// fmax will not be included
				smax = ar[i];
			}
		}
		System.out.println("Second max = " + smax);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] < smax && ar[i] > tmax)

				tmax = ar[i];

		}
		System.out.println("Third max = " + tmax);

	}
}
