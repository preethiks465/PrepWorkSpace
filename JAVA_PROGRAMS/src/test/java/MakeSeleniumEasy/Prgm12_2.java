package MakeSeleniumEasy;

import java.util.Scanner;

public class Prgm12_2 {

	// A method of finding and printing divisor
	static void findAndPrintDivisors(int n) {

		for (int i = 1; i <= n / 2; i++) {

			if (n % i == 0)
				System.out.print(i);

		}
		System.out.print(n);

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number greater than zero:");
		int num = sc.nextInt();
		System.out.println("The divisors of " + num + " are: ");
		findAndPrintDivisors(num);
	}

}