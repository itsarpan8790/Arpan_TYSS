package LearnCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractise {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(5);
		ts.add(20);
		ts.add(6);
		ts.add(0);

		System.out.println("Printing in Forward Direction");
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Printing in Backward Direction");
		System.out.println(ts.descendingSet());

	}

}
