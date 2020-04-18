package CustomExpectedConditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
public static WebDriver driver;
@BeforeMethod
public static void Initialization() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.google.co.in");
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(new waitforpageload());
}
@Test
public void test1() {
	System.out.println("HI");
}
}
