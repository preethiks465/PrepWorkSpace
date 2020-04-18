package kk;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String revs="";
		for(int i=s.length()-1;i>=0;i--) {
			revs=revs+s.charAt(i);
		}
		if(s.equals(revs)) {
			System.out.println("Palindrome");
		}

	}

}
