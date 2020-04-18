package MakeSeleniumEasy;

import java.util.Scanner;

public class Prgm36 {
// Java Program to Invert Case of Each Char in a String
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter string");
		String s = input.nextLine();
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				output = output + Character.toLowerCase(s.charAt(i));
			}
			if (Character.isLowerCase(s.charAt(i))) {
				output = output + Character.toUpperCase(s.charAt(i));
			}
		}
System.out.println(output);
	}

}
