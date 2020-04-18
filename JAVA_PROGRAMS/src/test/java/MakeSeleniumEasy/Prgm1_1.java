package MakeSeleniumEasy;

import java.util.Scanner;
//Java Program to Check If a Given Number is Palindrome 
public class Prgm1_1 {

	public static void main(String[] args) {
		int temp=0;
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the input number");
		 int n = input.nextInt();
		 int n1=n;
		 while(n1>0) {
			 temp=temp*10 + n1%10;
			 n1=n1/10;
		 }
		 if(temp==n)
			 System.out.println("Palindrome Number");
		 else
			 System.out.println("Not Palindrome");
	}

}
