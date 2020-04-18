package JavaPrograms;
// Program to check if two strings are anagrams using java 8 streams
public class Prgm34_1 {
	static String s1 = "silent";
	static String s2 = "listen";
	public static void main(String[] args) {
		

		if (s1.length() == s2.length()) {
			sortusingStreams();
		} else
			System.out.println("Not Anagram");
	}

	public static void sortusingStreams() {
		s1=s1.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		s2=s2.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		System.out.println(s1+ " "+s2);
		if(s1.equals(s2)) {
			System.out.println("anagram");
		}
	}

}
