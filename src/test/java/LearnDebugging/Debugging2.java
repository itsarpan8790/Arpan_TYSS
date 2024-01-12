package LearnDebugging;

import org.testng.annotations.Test;

public class Debugging2 {
	
	@Test
	public void method() {
		String s="india";
		String rev="";
		
		
		System.out.println("Start Debugging");
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
