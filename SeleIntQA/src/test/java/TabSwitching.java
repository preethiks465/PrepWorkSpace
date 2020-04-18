import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TabSwitching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\version79\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.open()");
		Set<String> windowHandle = driver.getWindowHandles();
		System.out.println(driver.getWindowHandles().size());
		for(String w: windowHandle)
		driver.switchTo().window(w);
		driver.get("http://www.google.co.in");
	}
	
}
