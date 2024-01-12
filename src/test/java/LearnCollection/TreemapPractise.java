package LearnCollection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreemapPractise {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(10, "Value1");
		tm.put(20, "Value2");
		tm.put(10, "bye");
		tm.put(10, "Hello");
		// tm.put(null, "byee"); not allowed
		tm.put(20, null);
		tm.put(80, null);

		for (Entry<Integer, String> tmap : tm.entrySet()) {
			System.out.println(tmap.getKey() + "--> " + tmap.getValue());
		}

		for (Integer keys : tm.keySet()) {
			System.out.println(keys);
		}

		for (String values : tm.values()) {
			System.out.println(values);
		}

	}

}
