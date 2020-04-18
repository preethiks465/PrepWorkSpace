package JavaIntQA;

interface rbi {
	void deposit();

	void withdraw();
	public default void addharlink() {
		System.out.println("qqq");
	}
	public default void minbal() {
	}
}

class Axis implements rbi {

	@Override
	public void deposit() {
		System.out.println("axis deposit");

	}

	@Override
	public void withdraw() {
		System.out.println("axis withdraw");

	}
	
	public void addharlink(){
		System.out.println("hhh");
	}

}

class sbi implements rbi {

	@Override
	public void deposit() {
		System.out.println("sbi deposit");

	}

	@Override
	public void withdraw() {
		System.out.println("sbi withdraw");

	}
}
	class pnp implements rbi {

		@Override
		public void deposit() {
			System.out.println("pnp deposit");

		}

		@Override
		public void withdraw() {
			System.out.println("pnp withdraw");

		}

	}

public class bank {

	public static void main(String[] args) {
		Axis a = new Axis();
		a.addharlink();

	}}


