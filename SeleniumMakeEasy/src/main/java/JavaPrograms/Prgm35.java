package JavaPrograms;

import java.util.Stack;

public class Prgm35 {
// Program to reverse a String using Stack
	public static void main(String[] args) {
		String s = "Reverse String";
		String revs="";
		Stack<String> st = new Stack<>();
		char[] c = s.toCharArray();
		for (char ch : c) {
			st.push(String.valueOf(ch));
		}
		while(!st.isEmpty()) {
			revs=revs+st.pop();
		}
		System.out.println(revs);
	}

}
