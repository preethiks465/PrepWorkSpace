package JavaIntQA;

import java.util.Scanner;

public class digits_String {
static boolean flag=false;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the string");
		String s  = input.nextLine();
		if(s.length()==0||s==null) {
			flag=false;
		}
		else
		{
			char[]cs = s.toCharArray();
			for(int i=0;i<cs.length;i++) {
				if(Character.isDigit(cs[i])) {
					flag=true;
				}
				else
				{
					flag=false;
					break;
				}
			}
		}
		if(flag==true) {
			System.out.println("Digital String");
		}
		else
			System.out.println("Not a digital String");

	}

}
