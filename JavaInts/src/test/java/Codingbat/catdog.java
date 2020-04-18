package Codingbat;

public class catdog {

	public static void main(String[] args) {
		String str = "day fyyyz";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1) {
				if (str.charAt(i) == 'y' || str.charAt(i) == 'z')
					count++;
			}
			else
			if (str.charAt(i) == 'y' || str.charAt(i) == 'z' && !Character.isAlphabetic(str.charAt(i + 1)))
				count++;
		}
		System.out.println(count);
	}

}
