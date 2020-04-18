package MakeSeleniumEasy;

import java.util.ArrayList;
import java.util.List;

// Java Program to Print Fibonacci Series of Given Length Using Collection

public class Prgm13_1 {
	static public void main(String[] args) {
		int n = 10;
		List<Integer> fb = new ArrayList<Integer>();
		fb.add(0);
		fb.add(1);
		for (int i = 0; i < 10; i++) {
			fb.add(fb.get(i) + fb.get(i + 1));
		}
		System.out.println(fb);
	}
}
