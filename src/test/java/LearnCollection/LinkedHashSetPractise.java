package LearnCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractise {

	public static void main(String[] args) {
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();

		lhs.add(10);
		lhs.add("Hi");
		lhs.add(20);
		lhs.add("Hello");
		lhs.add(20);
		lhs.add(null);
		lhs.add(null);
		lhs.add(10);

		Iterator<Object> it = lhs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
