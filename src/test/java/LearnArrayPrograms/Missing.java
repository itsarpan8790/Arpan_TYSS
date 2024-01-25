package LearnArrayPrograms;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 1,5,15,20 };
		printmiss(ar);

	}
	public static void printmiss(int []a)
	{
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
