package Dum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class rough4 {

	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 3, 4, 1 };
		int count = 0;
		for (int i = 0; i < ar1.length; i++) {
			for (int j = i; j < ar1.length; j++) {
				if (ar1[i] == ar1[j]) {
					count++;
				}
				System.out.println(ar1[i]+" "+count);
			}
		}
	}

}
