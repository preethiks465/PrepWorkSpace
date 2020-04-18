package MakeSeleniumEasy;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Prgm28_1 {
	//Java Program to Remove Duplicate Characters From Word Using Collection Concept
	public static void main(String[] args) {
		String s = "banana";
		char[] c = s.toCharArray();
		LinkedHashSet<Character> hset = new LinkedHashSet<Character>();
		for (int i = 0; i < c.length; i++) {
			hset.add(c[i]);
		}
		System.out.println(hset.toString());
	}

}
