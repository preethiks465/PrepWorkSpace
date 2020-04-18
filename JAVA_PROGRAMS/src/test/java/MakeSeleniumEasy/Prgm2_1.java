package MakeSeleniumEasy;

public class Prgm2_1 {
	//Java Program to Check if Any String is Palindrome Without Using Reverse Method
	public static void main(String[] args) {
		String s = "madamq";
		String rev="";
		char[]c = s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		if(rev.contentEquals(s)) {
			System.out.println("Palindrome String");
		}
		else
			System.out.println("Not Palindrome");
	}

}
