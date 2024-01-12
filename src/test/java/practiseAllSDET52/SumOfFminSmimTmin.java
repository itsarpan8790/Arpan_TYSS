package practiseAllSDET52;

public class SumOfFminSmimTmin {
	public static void main(String[] args) {
		int ar[] = {4,1, 2, 3, 4, 5, 6,0 };

		int fmin = ar[0];//
		int smin = ar[1];//
		// int tmin = ar[2];

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] <=fmin) {
				if(ar[i]!=fmin)
				{
					smin = fmin;
				}
				fmin = ar[i];
			}else if(smin==fmin || smin>ar[i])
			{
				smin=ar[i];
			}

		}
		System.out.println(fmin+smin);
		
	}
}
