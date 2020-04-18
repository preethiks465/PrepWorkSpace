package swtestinghelp;

import java.util.Scanner;

public class swap_third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int temp;
		temp=i;
		i=j;
		j=temp;
		System.out.println("After swapping"+ i +" " + j);

	}

}
