package InterfacePackage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public interface TestNGInterface1 {
@BeforeMethod
public void setup(); 
@Test
public void test1();
}
