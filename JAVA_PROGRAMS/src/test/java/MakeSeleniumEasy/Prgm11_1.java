package MakeSeleniumEasy;

import java.util.Scanner;

public class Prgm11_1 {
// Find Position Of Letter In Alphabet
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char c = input.next().charAt(0);
		AlphabetPosition(c);
	}
	public static void AlphabetPosition(char c) {
		char clower = Character.toLowerCase(c);
		int n = (int)c;
		if(c==clower) {
		
		System.out.println(n-96);
		}
		else
			System.out.println(n-64);
	}
}
