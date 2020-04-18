package MakeSeleniumEasy;

public class Prgm33_2 {

	// Insert a String into Another String at given index
	static String s1 = "MakeEasy";
	static String s2 = "Selenium";
	static String res = "";

	public static void main(String[] args) {
		for (int i = 0; i < s1.length(); i++) {

			if (i != 4) {
				res = res + s1.charAt(i);

			} else
				res = res + s2 + s1.charAt(i);
		}
		System.out.println(res);
	}

}
