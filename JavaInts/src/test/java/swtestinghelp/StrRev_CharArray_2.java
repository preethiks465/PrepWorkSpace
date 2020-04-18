package swtestinghelp;

public class StrRev_CharArray_2 {

	public static void main(String[] args) {
		String str = "This is Auto";
		String rev = "";
		char[] c = str.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		System.out.println(rev);
	}

}
