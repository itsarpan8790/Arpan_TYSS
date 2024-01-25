package practiseAllSDET52;

public class MissingSeries {
	public static void main(String[] args) {
		int[] ar = { 1,5,15,20 };
		printMissing(ar);
	}
	public static void printMissing(int[]a)
	{
		int k=1;
		for(int i=0;i<a.length;i++)
		{
			if(i!=a.length-1)
			{
			if(a[i]<a[i+1])a[i]=a[i];
			else
			{
				a[i]=a[i]+a[i+1];
				a[i+1]=a[i]-a[i+1];
				a[i]=a[i]-a[i+1];
			}
		}
	}
		for(int i=1;i<a[a.length-1];i++) {
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==1)
				{
					i++;break;
				}
			}
			System.out.println(i +" ");
		}
		

}
}