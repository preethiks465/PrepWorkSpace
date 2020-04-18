
public class CBRE {

	public static void main(String[] args) {
		String s = "Preethi Is In A Interview";
		StringBuffer s1 = new StringBuffer(s);
		
		char[] c = s.toCharArray();
		int ucount = 0, lcount = 0;
		for (int i = 0; i < c.length; i++) {
			if (Character.isUpperCase(c[i])) {
				ucount++;
			} else if (Character.isLowerCase(c[i])) {
				lcount++;
			}
		}
		System.out.println(ucount);
		System.out.println(lcount);

	}

}
