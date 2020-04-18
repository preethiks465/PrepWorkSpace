package InterfacePackage;

import org.testng.annotations.Test;

public class test2 implements TestNGInterface1 {

	@Override
	public void setup() {
		System.out.println("setup");

	}

	@Override
	public void test1() {
		System.out.println("test1");

	}
	@Test
	public void te() {
		System.out.println("te");
	}

}
