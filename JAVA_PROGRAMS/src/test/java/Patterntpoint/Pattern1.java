package Patterntpoint;

public class Pattern1 {

	public static void main(String[] args) {
		//5432*
		//543*1
		//54*21
		//5*321
		//*4321
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(j==i) {
					System.out.print("*");
				}
				else
					System.out.print(j);
			}
			System.out.println();
		}

	}

}
