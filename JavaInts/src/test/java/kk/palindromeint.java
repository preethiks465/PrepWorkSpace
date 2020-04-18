package kk;

public class palindromeint {

	public static void main(String[] args) {
		int i=12344321;
		int ini=i;
		int rev=0;
		while(i>0) {
			rev=rev*10+i%10;
			i=i/10;
		}
		System.out.println(rev);
		if(rev==ini) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not ");
	}

}
