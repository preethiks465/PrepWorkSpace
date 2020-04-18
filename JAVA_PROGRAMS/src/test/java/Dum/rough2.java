package Dum;

import java.util.Scanner;
import java.util.Stack;

public class rough2 {

	public static void main(String[] args) {
		Stack<Character>st=new Stack<Character>();
		String s="Preethi Krishna";
	
		String sh="";
		char[]c= s.toCharArray();
		for(Character ch:c) {
			st.push(ch);
		}
		while(!st.isEmpty()) {
			sh=sh+st.pop();
		}
		System.out.println(sh);
	}

}
