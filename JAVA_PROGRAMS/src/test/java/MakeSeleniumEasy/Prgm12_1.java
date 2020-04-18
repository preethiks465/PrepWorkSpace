package MakeSeleniumEasy;

import java.util.Scanner;

public class Prgm12_1 {

	// A method of finding and printing divisor using squareroot
	static void findAndPrintDivisors(int n) {
		int max = (int) Math.sqrt(n);
		for (int i = 1; i <= max; i++) {
			if (n % i == 0) {
				if (n / i == i)
					System.out.print(i);
				else
					System.out.println(i + " " + n / i);
			}
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number greater than zero:");
		int num = sc.nextInt();
		System.out.println("The divisors of " + num + " are: ");
		findAndPrintDivisors(num);
	}

}