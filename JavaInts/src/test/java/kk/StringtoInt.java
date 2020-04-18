package kk;

public class StringtoInt {
	
	public static void main(String[]args) {
		int sum=0;
		//System.out.println((int)'0');
		String inputString="123";
		for(int i=0;i<=inputString.length()-1;i++) {
			int j=inputString.charAt(i)-'0';
			sum=sum*10+j;
		}
		System.out.println(sum);
	}

}
