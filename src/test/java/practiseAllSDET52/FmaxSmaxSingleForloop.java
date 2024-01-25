package practiseAllSDET52;

public class FmaxSmaxSingleForloop {
	public static void main(String[] args) {
		int[] ar = { 8, 2, 1, 3, 4, 5, 6, 7,8,8 };
		int secondmax=SecondMax(ar);
		System.out.println(secondmax);

	}
	public static int SecondMax(int[] a)
	{
		
	//	for(int i=0,j=i+1;i<=a.length;i++,j++)
		//{
			//if(a[i]>a[j])
		int max=0;
		int secondmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secondmax=max;
				max=a[i];
			}
			else if(a[i]>secondmax &&a[i]!=max)
			{
				secondmax=a[i];
			}
		}
		return secondmax;
			
	}
}
