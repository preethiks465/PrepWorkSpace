package MakeSeleniumEasy;

public class Prgm10_1 {
// Draw An Equilateral Triangle Using Stars Of Given Row
	public static void main(String[] args) {

		int n = 5;
		int rowcounter = 0;
		int spacecounter = 0, starcounter = 0;
		int spaces = n-1;
		for (rowcounter = 1; rowcounter <= n; rowcounter++) {
			for (spacecounter=1;spacecounter<=spaces;spacecounter++) {
				System.out.print(" ");
			}
			spaces=spaces-1;
			for(starcounter=1;starcounter<=rowcounter;starcounter++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
