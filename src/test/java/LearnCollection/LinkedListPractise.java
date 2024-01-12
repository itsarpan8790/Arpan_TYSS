package LearnCollection;

import java.util.LinkedList;

public class LinkedListPractise {
	public static void main(String[] args) {
		LinkedList<Object> manju = new LinkedList<Object>();
		manju.add("Arpan");
		manju.add(20);
		manju.add(null);
		manju.add(null);
		manju.add("Duplicate1");
		manju.add("Duplicate2");
		manju.add("Duplicate1");
		manju.add("Duplicate2");
		manju.add(50);
		manju.add("Arpan");
		manju.addFirst("Start");
		manju.addLast("End");
		manju.removeFirst();
		manju.addFirst("Start Added");
		manju.removeLast();
		manju.addLast("End Added");
		for (Object mn : manju) {
			System.out.println(mn);
			
		}
		
		
	}

}
