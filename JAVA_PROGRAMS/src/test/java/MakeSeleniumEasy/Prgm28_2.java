package MakeSeleniumEasy;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Prgm28_2 {
	//Java Program to Remove Duplicate Characters From Word Using Collection Concept
	public static void main(String[] args) {
		String s = "banana";
		String res = "";
		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (hmap.get(c[i]) == null) {
				hmap.put(c[i], 1);
			} else
				hmap.put(c[i], hmap.get(c[i]) + 1);
		}
//System.out.println(hmap);
		Set<Entry<Character, Integer>> entries = hmap.entrySet();
		for (Entry<Character, Integer> entry : entries) {
			if (entry.getValue() > 1) {
				res = res + entry.getKey();
				s=s.replace(String.valueOf(entry.getKey()), "");
			}
		}
System.out.println(s);
	}

}
