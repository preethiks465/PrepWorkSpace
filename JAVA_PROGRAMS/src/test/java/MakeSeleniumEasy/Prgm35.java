package MakeSeleniumEasy;

import java.util.Stack;

public class Prgm35 {
	//Java Program to Reverse a String Using Stack
	public static void main(String[] args) {
		String input = "autorabit";
		String output = "";
		char[] c = input.toCharArray();
		Stack<Character> stc = new Stack<>();
		for (Character s : c) {
			stc.push(s);
		}
		while (!stc.isEmpty()) {
			output=output+stc.pop();
		}
		System.out.println(output);
	}

}
