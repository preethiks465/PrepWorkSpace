package swtestinghelp;

public class StrRev_Reverse_1 {

	public static void main(String[] args) {
		String s1 = "This is Auto";

		StringBuilder sb1 = new StringBuilder();
		sb1.append(s1);
		System.out.println(sb1.reverse());

		StringBuffer sb2 = new StringBuffer();
		sb2.append(s1);
		System.out.println(sb2.reverse());
	}

}
