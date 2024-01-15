package TyssMail;

import java.util.LinkedList;

import org.testng.annotations.Test;

public class Arpan20220816_160621 {
	@Test
	public void SubString() {
		String s = "Welcome";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = i; j < s.length(); j++) {
				String sb = s.substring(i, j + 1);
				System.out.println(sb);
				count++;
			}
		}
		System.out.println(count);
	}
	@Test
	public void palindromeLinkedList() {
		LinkedList<String> ls1 = new LinkedList<String>();
		ls1.add("dog");
		ls1.add("cat");
		ls1.add("dog");
		LinkedList<String> ls2 = new LinkedList<String>();
		for(int i=ls1.size()-1;i>=0;i--) {
			ls2.add(ls1.get(i));
		}
		if(ls1.equals(ls2)) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("NotPallindrome");
			
		}
	}
	
	/**
	 * Q3--Similarity bw HashMap and HashTable
	 * 1.Strore Data in form of K_V pair
	 * 2.Insertion order not maintained
	 * 3.Data structure is Hashtable in both
	 */
	@Test
	public void Fibonacci() {
		int num=10;
		
		int num1=0,num2=1;
		int count=0;
		
		while(count<num) {
			System.out.print(num1);
			System.out.print(" ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			count++;
		}
		
	}
	
}
