package epam;

import java.util.*;
import java.util.Map.Entry;

public class countofchar {

	public static void main(String[] args) {
		String s = "I am in a interview";
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		for (Character c : ch) {
			if (hmap.get(c) == null) {
				hmap.put(c, 1);
			} else
				hmap.put(c, hmap.get(c) + 1);
		}
		Set<Entry<Character, Integer>> entry = hmap.entrySet();
		for (Entry<Character, Integer> en : entry) {
			System.out.println(en.getKey() + " occured " + en.getValue() + " times");
		}
	System.out.println("*************************************************************");	
		
		for(Character c1: hmap.keySet()) {
			System.out.println(c1 + " occured " + hmap.get(c1) + " times");
		}
	}

}
