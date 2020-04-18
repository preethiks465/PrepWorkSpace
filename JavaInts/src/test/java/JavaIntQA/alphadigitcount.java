package JavaIntQA;
import java.util.*;
public class alphadigitcount {

	public static void main(String[] args) {
		int alphacount=0;
		int digicount=0;
		int others=0;
		int spacecount=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=input.nextLine();
		char[]c=s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			if(Character.isAlphabetic(c[i])) {
				alphacount++;
			}
			else if(Character.isDigit(c[i])) {
				digicount++;
			}
			else if(Character.isSpace(c[i])) {
				spacecount++;
			}
			else
				others++;
		}
		System.out.println("Alpha count"+alphacount);
		System.out.println("Digital count"+digicount);
		System.out.println("Space count"+spacecount);
		System.out.println("others count"+others);
	}

}
