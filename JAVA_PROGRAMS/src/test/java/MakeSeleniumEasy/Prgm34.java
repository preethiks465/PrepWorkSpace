package MakeSeleniumEasy;

import java.util.Arrays;
import java.util.Scanner;

public class Prgm34 {
	public static void main(String[] args) {
		// Java Program to Check if Two Strings are Anagram
		System.out.println("Enter the Anagram Strings");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		System.out.println(
				WithStreams(s1, s2) ? s1 + " and " + s2 + " are anagrams" : s1 + " and " + s2 + " are not anagrams");
		System.out.println(
				withArrays(s1, s2) ? s1 + " and " + s2 + " are anagrams" : s1 + " and " + s2 + " are not anagrams");
	}

	public static boolean WithStreams(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		s1 = s1.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
		s2 = s2.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
		if (!(s1.equals(s2)))
			return false;

		return true;

	}

	public static boolean withArrays(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (!Arrays.equals(c1, c2))
			return false;

		return true;
	}
}
