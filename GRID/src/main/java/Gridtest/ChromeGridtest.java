package Gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChromeGridtest {
	public static WebDriver driver;

	@BeforeMethod
	public void setup() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\Selenium\\drivers\\version79\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		String huburl = "http://172.16.0.241:4444/wd/hub";
		String nodeurl = "http://172.16.0.211:11482/wd/hub";
		driver = new RemoteWebDriver(new URL(nodeurl), options);
	}

	@Test
	public void testa() {

		driver.get("https://www.crmpro.com");
		System.out.println(driver.getTitle());

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
