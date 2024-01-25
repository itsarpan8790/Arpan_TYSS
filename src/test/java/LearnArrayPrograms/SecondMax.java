package LearnArrayPrograms;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {12,8, 2, 1, 3, 4, 5, 6, 7,8,10 };
		
		int fmax=0;
		int smax=ar.length-1;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>fmax) {
				smax=fmax;
				fmax=ar[i];
			}
			else if (ar[i] > smax && ar[i] < fmax) {
                smax = ar[i];
            }
		}
		System.out.println(fmax+" "+smax);
		
	}

}
