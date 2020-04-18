package SeleniumExpress;

public class test2 {

	public static <T extends Human> void m1(T j) {
		System.out.println("hhhhhhhh");

	}

	public static void main(String[] args) {

		m1(new Human());
		m1(new Doctor());
	}

}
