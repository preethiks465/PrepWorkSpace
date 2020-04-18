
public class pclass1 implements int1, i2 {

	@Override
	public void m1() {
		System.out.println("i am common m1");

	}

	public static void main(String[] args) {
		int1 p1 = new pclass1();
		p1.m1();
		i2 p2 = new pclass1();
		p2.m1();
	}

}
