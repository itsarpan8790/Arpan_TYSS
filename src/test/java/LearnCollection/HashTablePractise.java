package LearnCollection;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTablePractise {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(10, "Value1");
		ht.put(20, "bye");
		ht.put(10, "Value2");
		ht.put(60, "Value2");
		ht.put(30, "Thirty");
		// ht.put(null, "hi"); not allowed
		// ht.put(20, null);not allowed

		for (Entry<Integer, String> hmap : ht.entrySet()) {
			System.out.println(hmap.getKey() + "--> " + hmap.getValue());
		}

		for (Integer keys : ht.keySet()) {
			System.out.println(keys);
		}

		for (String values : ht.values()) {
			System.out.println(values);
		}

	}

}
