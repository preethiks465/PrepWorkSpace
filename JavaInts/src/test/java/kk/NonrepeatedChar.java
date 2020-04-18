package kk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

public class NonrepeatedChar {

	public static void main(String[] args) {
		String s = "i am an indian";
		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		//HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			if (hmap.get(c) == null) {
				hmap.put(c, 1);
			} else
				hmap.put(c, hmap.get(c) + 1);
		}
		Set<Entry<Character, Integer>> entry = hmap.entrySet();
		for (Entry<Character, Integer> en : entry) {
			if (en.getValue()==1) {
				System.out.println(en.getKey());
				break;
			}
		}

	}

}
