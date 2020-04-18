package MakeSeleniumEasy;

public class Prgm33_1 {

	public static void main(String[] args) {
		// Insert a String into Another String at given index
		String s1 = "MakeEasy";
		String s2 = "Selenium";
		int index = 4;
		StringBuilder s = new StringBuilder();
		s.append(s1);
		s.insert(4, s2);
		System.out.println(s);
	}

}
