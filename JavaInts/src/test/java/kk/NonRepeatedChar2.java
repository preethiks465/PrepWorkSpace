package kk;

public class NonRepeatedChar2 {

	public static void main(String[] args) {
		String s = "aaabbcdd";
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(s.indexOf(c[i])==s.lastIndexOf(c[i])){
				System.out.println("First repeated char "+ c[i]);
				break;
			}
		}

	}

}
