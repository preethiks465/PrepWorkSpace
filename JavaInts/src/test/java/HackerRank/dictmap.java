package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class dictmap {
	public static void main(String[] argh) {
		HashMap<String,Integer>hmap = new HashMap<String,Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			hmap.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			if(hmap.get(s)==null) {
				System.out.println("Not found.");
			}
			else
				System.out.println(s+" "+hmap.get(s));
		}
		in.close();
	}
}
