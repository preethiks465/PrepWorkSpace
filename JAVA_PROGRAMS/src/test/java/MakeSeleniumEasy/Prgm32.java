package MakeSeleniumEasy;

public class Prgm32 {
	public static void main(String[]args) {
		// Swap Two String Variables Without Using Third Variable
		String s1="make";
		String s2="easy";
		System.out.println(s1+" "+s2);
		s1=s1+s2;
		s2=s1.substring(0,(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		
		System.out.println(s1+" "+s2);
	}

}
