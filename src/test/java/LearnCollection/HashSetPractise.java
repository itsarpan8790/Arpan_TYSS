package LearnCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractise {
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		hs.add("Arpan");
		hs.add(20);
		hs.add(null);
		hs.add(null);
		hs.add(null);
		hs.add("Duplicate1");
		hs.add("Duplicate2");
		hs.add("Duplicate1");
		hs.add("Duplicate2");
		hs.add(50);
		hs.add("Arpan");

		System.out.println("Printing HashSet through Iterator");
		Iterator<Object> itHS = hs.iterator();
		while (itHS.hasNext()) {
			System.out.println(itHS.next());
		}

		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add(10);
		al.add(null);
		al.add(null);

		System.out.println("Printing ArrayList through Iterator");
		Iterator<Object> itAL = al.iterator();
		while (itAL.hasNext()) {
			System.out.println(itAL.next());
		}

	}
}
