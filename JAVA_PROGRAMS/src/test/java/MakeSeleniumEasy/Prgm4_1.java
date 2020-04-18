package MakeSeleniumEasy;

public class Prgm4_1 {
//Java Program to Extract Numbers From String and Add
	public static void main(String[] args) {
		String s = "pree345kree";
		int sum = 0;
		if (s.matches("[a-zA-Z0-9]*")) {

			for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(s.charAt(i))) {
					sum = sum + Character.getNumericValue(s.charAt(i));
				}
			}
			System.out.println(sum);
		}

	}

}
