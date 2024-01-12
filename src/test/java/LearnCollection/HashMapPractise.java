package LearnCollection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPractise {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(10, "Value1");
		hm.put(20, "Value2");
		hm.put(10, "bye");

		hm.put(null, "byee");
		hm.put(null, "hii");// only one key as allowed overriding
		hm.put(20, null); //duplicate key overriden
		hm.put(80, null);

		for (Entry<Integer, String> hmap : hm.entrySet()) {
			System.out.println(hmap.getKey() + "--> " + hmap.getValue());
		}

//		for (Integer keys : hm.keySet()) {
//			System.out.println(keys);
//		}
//
//		for (String values : hm.values()) {
//			System.out.println(values);
//		}

	}

}
