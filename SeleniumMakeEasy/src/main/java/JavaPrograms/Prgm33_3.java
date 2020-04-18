package JavaPrograms;

public class Prgm33_3 {
	// Program to insert a destination string into source at a particular index
	public static void main(String[] args) {
		String s1 = "MakeEasy";
		String s2 = "Selenium";
		String result = "";
		int index = 4;
		for (int i = 0; i < s1.length(); i++) {
			if (i != 4) {
				result = result + s1.charAt(i);
			} else
				result = result + s2+s1.charAt(i);
		}

		System.out.println(result);
	}

}
