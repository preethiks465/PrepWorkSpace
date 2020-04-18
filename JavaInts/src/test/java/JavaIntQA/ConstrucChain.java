package JavaIntQA;

public class ConstrucChain {

	ConstrucChain() {
		this(10);
		System.out.println("Inside default constructor");

	}

	ConstrucChain(int i) {
		this(12.0,8);
		System.out.println("Inside int param constructor");

	}
	ConstrucChain(double d,int i) {
		//this();
		System.out.println("Inside double and int param constructor");

	}
	public static void main(String[] args) {
		ConstrucChain cc = new ConstrucChain();
		//ConstrucChain cc1 = new ConstrucChain(10);
	}
}
