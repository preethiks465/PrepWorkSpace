package swtestinghelp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HmapIteration {

	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("preethi", 2);
		hmap.put("preethi", 1);
		hmap.put("krishna", 3);
		hmap.put("rahul", 4);
		hmap.put("karthika", 5);
		System.out.println("First Way");
		System.out.println("**********************");
		Iterator<Entry<String, Integer>> it = hmap.entrySet().iterator();
		while (it.hasNext()) {
			String key = it.next().getKey();
			Integer val = hmap.get(key);
			System.out.println(key + " " + val);
		}
		System.out.println("\n");
		System.out.println("Second Way");
		System.out.println("**********************");
		for (Entry<String, Integer> entry : hmap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		System.out.println("\n");
		System.out.println("Third Way");
		System.out.println("**********************");
		Set<Entry<String, Integer>> entry = hmap.entrySet();
		for (Entry<String, Integer> en : entry) {
			System.out.println(en.getKey() + " " + en.getValue());
		}
		System.out.println("\n");
		System.out.println("Fourth Way");
		System.out.println("**********************");
		Set<String> keys = hmap.keySet();
		for (String key : keys) {
			System.out.println(key + " " + hmap.get(key));
		}
	}

}
