package swtestinghelp;

import java.util.HashMap;

public class Wordscount_hashmap {

	public static void main(String[] args) {
		String str = "I am in a interview I am a graduate";
		HashMap<String,Integer>hmap = new HashMap<String,Integer>();
		String[]words = str.split("");
		for(String word: words) {
			if (hmap.get(word)==null) {
				hmap.put(word, 1);
			}
			else
				hmap.put(word, hmap.get(word)+1);
		}
		System.out.println(hmap);
		
	}

}
