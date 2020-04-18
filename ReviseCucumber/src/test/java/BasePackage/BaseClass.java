package BasePackage;

//import org.junit.Before;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class BaseClass {
	@Before ("@smke")
	public void method1() {
		System.out.println("method1");
	}
}
