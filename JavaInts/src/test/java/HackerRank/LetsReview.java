package HackerRank;

import java.util.Scanner;

public class LetsReview {
	public static void main(String[] args) {
		String s1 = "";String s2="";
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = input.nextLine();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= s[i].length() - 1; j+=2) {
					s1 = s1+s[i].charAt(j);
			}
			for (int j = 1; j <= s[i].length() - 1; j+=2) {
				s2 = s2+s[i].charAt(j);
		}
			System.out.println(s1+" "+s2);
			s1="";
			s2="";
		}
	}
}
