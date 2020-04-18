package MakeSeleniumEasy;

import java.util.ArrayList;
import java.util.List;

public class Prgm31_2 {
	// Java Program to Find Common Characters in Two Given Strings
	public static void main(String[] args) {
		String s1 = "preethi";
		String s2 = "krishna";
		List<String> a1 = new ArrayList<>();
		List<String> a2 = new ArrayList<>();
		for (int i = 0; i < s1.length(); i++) {
			a1.add(String.valueOf(s1.charAt(i)));
		}
		for (int i = 0; i < s2.length(); i++) {
			a2.add(String.valueOf(s2.charAt(i)));
		}

		a1.retainAll(a2);
		System.out.println(a1);
	}
}
