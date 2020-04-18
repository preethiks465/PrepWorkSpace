package rough;

public class patt1 {

	public static void main(String[] args) {
		int n = 10;String s="";
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j > 0; j--) {
				if (i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				s=s+i;
			}
		}
		System.out.println(s);
		
	}

}
