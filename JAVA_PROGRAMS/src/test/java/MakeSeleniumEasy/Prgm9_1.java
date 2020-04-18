package MakeSeleniumEasy;

public class Prgm9_1 {
// Printing Words In Circular Order From Given Index
	public static void main(String[] args) {
		String s = "Autorabit delivers continous delivery for saas platforms";
		String c[] = s.split(" ");
		String r = "";
		int n = 2;
		for (int i = n; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		for (int i = 0; i < n; i++) {
			System.out.print(c[i]+" ");
		}
	}

}
