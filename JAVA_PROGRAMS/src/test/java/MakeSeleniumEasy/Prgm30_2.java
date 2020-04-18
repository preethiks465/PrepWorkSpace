package MakeSeleniumEasy;

public class Prgm30_2 {
//Java Program to Find Distinct Characters In Given String
	public static void main(String[] args) {
		String s = "Make Selenium Easy";
		String res = "";
		String res2 = "";
		s = s.toLowerCase();
		s = s.replace(" ", "");

		for (int i = 0; i < s.length(); i++) {
			if (s.lastIndexOf(s.charAt(i)) == i && !(res2.contains(String.valueOf(s.charAt(i))))) {
				res = res + s.charAt(i);
			} else
				res2 = res2 + s.charAt(i);
		}
		System.out.println(res);
	}
}
