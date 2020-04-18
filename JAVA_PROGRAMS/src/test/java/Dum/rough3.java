package Dum;

import java.util.Scanner;

import junit.framework.Assert;

public class rough3 {

	public static void main(String[] args) throws MyException {
		String s = "make selenium easy";
		StringBuilder sb = new StringBuilder();
		String[] words = s.split(" ");
		for (String word : words) {
			if (Character.isLowerCase((word.charAt(0)))) {
				sb.append(Character.toUpperCase(word.charAt(0)));
				sb.append(word.substring(1) + " ");
			} else
				sb.append(word.substring(0) + " ");
		}
		System.out.println(sb.toString().trim());

	}
}
