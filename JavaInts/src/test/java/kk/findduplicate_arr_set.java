package kk;

import java.util.HashSet;
import java.util.Set;

public class findduplicate_arr_set {
	public static void main(String[] args) {
		int[] ar = { 10, 6, 8, 100, 65, 10, 8, 100 };

		Set<Integer> hset = new HashSet<Integer>();
		for(Integer i:ar) {
			if(!hset.add(i)) {
				System.out.println("Duplicate is "+i);
			}
			
				
		}
	}
}

//space complexity of array is O(n) and the space complexity of hset is O(n) but as only one for loop is used the 
//time complexity is O(n)