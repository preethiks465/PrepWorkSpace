package swtestinghelp;

public class StrRev_Split_2 {

	public static void main(String[] args) {
		String str = "This is Auto";
		String revword="",revstring="";
		String[] s = str.split(" ");
		for(int i=s.length-1;i>=0;i--) {
			String word = s[i];
				for(int j=word.length()-1;j>=0;j--) {
					revword = revword+word.charAt(j);
				}
				revword=revword+" ";
		}
		System.out.println(revword);
	}

}
