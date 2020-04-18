package MakeSeleniumEasy;

public class Prgm33_3 {
	// Insert a String into Another String at given index
	public static void main(String[] args) {
		String s1 = "MakeEasy";
		String s2 = "Selenium";
		String res = s1.substring(0, 4) + s2 + s1.substring(4);
		System.out.println(res);

	}

}