package MakeSeleniumEasy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Prgm15_1 {
	// Java Program to Find Length of String Without Using Length Method
//Method-1:
	public static void main(String[] args) {
		String s = "program";
		int i = 1;
		System.out.println(s.lastIndexOf(""));
		char c[] = s.toCharArray();
		Map<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		for (char cs : c) {
			hmap.put(cs, i++);
		}
		hmap.get('m');
	}

//Method-2: lastIndexOf("") returns the length of the string
	public static void len() {
		String s = "preethi";
		System.out.println(s.lastIndexOf(""));
	}
}
