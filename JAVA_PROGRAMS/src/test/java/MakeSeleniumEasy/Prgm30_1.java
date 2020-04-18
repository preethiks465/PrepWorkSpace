package MakeSeleniumEasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prgm30_1 {
	//Java Program to Find Distinct Characters In Given String
	public static void main(String[] args) {
		String s = "Make Selenium Easy";
		s = s.toLowerCase();
		s.replace(" ", "");
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (hmap.get(c[i]) == null) {
				hmap.put(c[i], 1);
			} else
				hmap.put(c[i], (hmap.get(c[i])) + 1);
		}

		Set<Entry<Character, Integer>> entries = hmap.entrySet();
		for (Entry<Character, Integer> entry : entries) {
			if (entry.getValue()==1)
				System.out.println(entry.getKey());
		}
	}

}
