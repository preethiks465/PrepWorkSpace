package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int j = n - 1;
		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[j]);
			arr[i] = arrItem;
			j--;
		}
		for(int k: arr) {
			System.out.print(k+" ");
		}
		scanner.close();
	}
}
