package JavaPrograms;

//Program to find if two string are anagrams using iteration
public class Prgm34_3 {
	static String s1 = "Listen";
	static String s2 = "Silent";

	public static void main(String[] args) {
		// changing the case of both strings
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		// verifying the length of both strings
		if (s1.length() == s2.length()) {
			checkanagram();
		} else {
			System.out.println("Not Anagram");
		}

	}

	public static void checkanagram() {
		int count=0;
		for (int i = 0; i < s1.length(); i++) {
			if (s2.contains(String.valueOf(s1.charAt(i)))) {
				s1.replace(String.valueOf(s1.charAt(i)),"");
				s2.replace(String.valueOf(s1.charAt(i)),"");
				count++;
			}
			else {
				System.out.println("Not Anagram");
				break;}
			if(count==s1.length()) {
				System.out.println("Anagram");
			}
		}

	}

}
