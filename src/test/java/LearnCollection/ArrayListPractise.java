package LearnCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractise {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("Arpan");
		al.add(20);
		al.add(null);
		al.add(null);
		al.add("Duplicate1");
		al.add("Duplicate2");
		al.add("Duplicate1");
		al.add("Duplicate2");
		al.add(50);
		al.add("Arpan");
		System.out.println(al);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(30);
		list.add(60);
		list.add(10);
	
		//list.add(null); NullPointerException
		Collections.sort(list);
		
		for(Integer i:list) {
			System.out.println(i);
			
		}
		
		
		
		
		
	}

}
