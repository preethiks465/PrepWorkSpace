package MakeSeleniumEasy;

public class Prgm29_1 {
// Java Program to Remove Duplicate Characters From Word Without Using Collection Concept
	public static void main(String[] args) {
		String input = "abcabcabcabc";
		String res = "";
		char[] c = input.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (!(res.contains(String.valueOf(c[i])))) {
				res = res + c[i];
			}
		}
		System.out.println(res);
	}

}
