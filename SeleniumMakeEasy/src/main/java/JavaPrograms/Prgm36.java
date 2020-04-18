package JavaPrograms;

import java.util.Scanner;

// Java Program to Invert case of each char in a string

public class Prgm36 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Input String");
		String inputString = input.nextLine();
		StringBuilder s = new StringBuilder();
		char[] c = inputString.toCharArray();
		for(char ch: c) {
			if(Character.isUpperCase(ch)) {
				s.append(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch)) {
				s.append(Character.toUpperCase(ch));
			}
			else
			s.append(ch);
				
		}
		System.out.println(s);
	}
}
