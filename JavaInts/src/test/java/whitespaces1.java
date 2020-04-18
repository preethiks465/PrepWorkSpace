
public class whitespaces1 {

	public static void main(String[] args) {
		String s="this is white spaces program                     d";
		String s1 = s.replaceAll("\\s", "");
		System.out.println(s1);
	}
}
