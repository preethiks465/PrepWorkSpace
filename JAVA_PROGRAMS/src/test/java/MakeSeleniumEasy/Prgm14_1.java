package MakeSeleniumEasy;

public class Prgm14_1 {
	// Java Program to Print Fibonacci Series of Given Length Using Recursion
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++)
			System.out.print(febonacci(i - 1)+" ");
	}

	public static int febonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return (febonacci(n - 1) + febonacci(n - 2));

	}
}
