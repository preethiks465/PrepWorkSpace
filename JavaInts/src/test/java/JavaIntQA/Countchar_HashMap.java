package JavaIntQA;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Countchar_HashMap {

	public static void main(String[] args) {
		String str = "I am in a interview";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (Character c : ch) {
			if (hmap.get(c) == null) {
				hmap.put(c, 1);
			} else
				hmap.put(c, hmap.get(c) + 1);
		}
		Set<Entry<Character, Integer>> entries = hmap.entrySet();
		for (Entry<Character, Integer> entry : entries) {
			System.out.println(entry.getKey() + " occured " + entry.getValue());
		}

		System.out.println("**************************************");
		Set<Character> keys = hmap.keySet();
		for(Character k:keys) {
			System.out.println(k + " occured "+hmap.get(k)+" times");
		}
	}

}
