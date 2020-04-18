package MakeSeleniumEasy;

import java.util.HashSet;
import java.util.Set;

public class Prgm31 {
	// Java Program to Find Common Characters in Two Given Strings
	public static void main(String[] args) {
		String s1 = "preethi";
		String s2 = "krishnae";
		String res="";
		Set<String>hset = new HashSet<String>();
		for (int i = 0; i < s1.length(); i++) {
			if (s2.contains(String.valueOf(s1.charAt(i)))) {
				res=res+s1.charAt(i);
				hset.add(String.valueOf(s1.charAt(i)));
			}
		}
		System.out.println(res);
		System.out.println(hset);
	}

}
