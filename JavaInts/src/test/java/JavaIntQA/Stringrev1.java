package JavaIntQA;

public class Stringrev1 {

	public static void main(String[] args) {
		String str = "preethi san";
		String revword="";
		String revstring="";
		String[] ss = str.split(" ");
		for(int i=0;i<ss.length;i++) {
			String sc = ss[i];
				for(int j=sc.length()-1;j>=0;j--) {
					revword = revword+sc.charAt(j);
				}
				
				revword=revword+" ";
		}
		revstring=revstring+revword;
		System.out.println(revstring);
	}

}
