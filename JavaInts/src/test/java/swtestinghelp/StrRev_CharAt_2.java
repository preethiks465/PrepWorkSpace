package swtestinghelp;

public class StrRev_CharAt_2 {

	public static void main(String[] args) {
		String str = "This is Auto";
		String revword="",revstring="";
		int s=str.length();
		for(int i=s-1;i>=0;i--) {
			
					revword = revword+str.charAt(i);
				}

		System.out.println(revword);
	}

}
