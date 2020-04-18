package MakeSeleniumEasy;

public class Prgm34_2 {
	// Java Program to Check if Two Strings are Anagram
	public static void main(String[] args) {
		if(main2())
			System.out.println("anagrams");
		else
			System.out.println("No");
	}

	public static boolean main2() {
		String s1 = "listen";
		String s2 = "sileht";
		if (s1.length() != s2.length()) {
			return false;
		} else {

			for (int i = 0; i < s1.length(); i++) {
				String sc1 = Character.toString(s1.charAt(i));
				if (!(s2.contains(sc1)))
					return false;
				else {
					s1.replaceAll(sc1, "");
					s2.replaceAll(sc1, "");
					if (s1.length() != s2.length()) {
						return false;
					}
				}
			}
		}
		return true;

	}

}
