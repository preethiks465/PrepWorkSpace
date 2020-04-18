package JavaIntQA;

public class wellsfargo {
	public static void main(String[] args) {
		String s = "i am feeling lucky";
		char[] c = new char[] { 'a', 'e', 'i', 'o', 'u' };
		int counter = 0;
		int i = 0, j = 0;
		String[] sar = s.split(" ");
		while (i < sar.length) {
			while (j < c.length) {
				while (sar[i].contains(String.valueOf(c[j]))) {
					System.out.println(sar[i]);
					counter++;
					i++;
					break;
				}
			}
		}

		/*
		 * for (int i = 0; i < sar.length; i++) { for (int j = 0; j < c.length; j++) {
		 * while (sar[i].contains(String.valueOf(c[j]))) { System.out.println(sar[i]);
		 * counter++; break; } // break; } }
		 */
			/*
			 * if (sar[i].contains("a") || sar[i].contains("e") || sar[i].contains("i") ||
			 * sar[i].contains("o") || sar[i].contains("u")) {
			 * 
			 * }
			 */
		
		if (counter == sar.length)
			System.out.println("String contains all vowels");

	}

}
