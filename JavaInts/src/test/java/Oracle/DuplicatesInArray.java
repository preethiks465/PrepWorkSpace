package Oracle;

import java.util.Arrays;

public class DuplicatesInArray {
	public static void main(String[] args) {
		int[] ar = new int[] { 3, 5, 7, 8, 2, 1 };
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		int pos = ar.length - 3;
		System.out.println(ar[pos]);

		/*
		 * Arrays.sort(ar); int pos = ar.length - 3; System.out.println(ar[pos]);
		 */
	}
}
