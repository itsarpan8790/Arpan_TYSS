package PrakashSirSpecific;

public class I_Am_banglore_Rotation {
	public static void main(String[] args) {
		String s = "i am from banglore";
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			String temp=str[i];
			for (int j = 1; j < str.length; j++) {
				str[j-1]=str[j];
				System.out.print(str[j]+" ");
			}
			str[str.length-1]=temp;
			System.out.println(temp);
		}
	}
}
