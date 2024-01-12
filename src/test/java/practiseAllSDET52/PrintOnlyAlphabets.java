package practiseAllSDET52;

import org.testng.annotations.Test;

public class PrintOnlyAlphabets {
	@Test
	public  void m1() {
		String s="abc_12@gmail.com";
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A'&& ch<='Z' || ch>='a'&& ch<='z')
				System.out.print(ch);
		}
	}
	@Test
	
	public  void m2() {
		String s="abc_12@gmail.com";
		
		for(int i=0;i<s.length();i++) {
			int num = s.charAt(i);
			if(num>=65 && num<=90 || num>=97 && num<=122)
				System.out.print(s.charAt(i));
		}
	}
}
