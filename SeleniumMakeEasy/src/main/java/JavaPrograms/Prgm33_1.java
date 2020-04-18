package JavaPrograms;

public class Prgm33_1 {
//Program to insert a destination string into source at a particular index
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Selenium");
		StringBuilder s2=new StringBuilder("MakeEasy");
		s2.insert(4, s1);
		System.out.println(s2);
	}

}
