package MakeSeleniumEasy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prgm8_1 {
//Program to find occurrence of individual characters in a given string.
	public static void main(String[] args) {
		String s = "I am in a demo";
		char[] c = s.toCharArray();
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (Character c1 : c) {
			if (hmap.get(c1) == null) {
				hmap.put(c1, 1);
			} else
				hmap.put(c1, hmap.get(c1) + 1);
		}

		Set<Entry<Character, Integer>> entries = hmap.entrySet();
		for (Entry<Character, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("************************************************************");
		for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("************************************************************");
		for (Character ch : hmap.keySet()) {
			System.out.println("key " + ch);
		}
		for (Integer ih : hmap.values()) {
			System.out.println("value " + ih);
		}
		System.out.println("************************************************************");

		for (Character ch : hmap.keySet()) {
			System.out.println(ch + " " + hmap.get(ch));
		}
		System.out.println("************************************************************");

		Iterator<Map.Entry<Character, Integer>> entry = hmap.entrySet().iterator();
		while (entry.hasNext()) {
			Map.Entry<Character, Integer> ent = entry.next();
			System.out.println(ent.getKey() + " " + ent.getValue());
		}
		System.out.println("************************************************************");
		//hmap.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
		hmap.forEach((k,v) -> System.out.println("key" + k +" value"+v));
	}

}
