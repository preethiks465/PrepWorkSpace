package JavaPrograms;

import java.util.Arrays;

public class Prgm34_2 {
//Program to check if two strings are anagrams using arrays.sort method
	static String s1 = "Listen";
	static String s2 = "Silent";
	
	public static void main(String[] args) {
		if (s1.length() == s2.length()) {
			anagramchk();
		} else
			System.out.println("Not Anagram");
	}

	public static void anagramchk() {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2)) {
			System.out.println("Anagram");
		}
		else
			System.out.println("Not Anagram");
	}

}
