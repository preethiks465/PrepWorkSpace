package JavaIntQA;

public class stringDemo {

	public static void main(String[] args) {
		String s1="this is s1";
		String s2="this is s1";
		String s3 = new String("this is s1");
		String s4 = new String("this is s1");
		if(s3.equals(s4)) {
			System.out.println("aaa");
		}
		else
			System.out.println("bbb");
	}

}
