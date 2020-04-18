package swtestinghelp;

import java.util.Scanner;

public class swap_nothird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println("Before Swapping "+ i + " "+j);
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("After Swapping "+ i +" "+ j);
	}

}
