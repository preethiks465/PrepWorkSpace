package MakeSeleniumEasy;

public class Prgm3_1 {
// Java Program to check if any string is palindrome Using inbuilt Reverse method of Java
	public static void main(String[] args) {
		String s = "madam";
		//String rev="";
		StringBuilder sb1 = new StringBuilder(s);
		sb1 = sb1.reverse();
		if(s.contentEquals(sb1)) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}

}
