package SeleniumTopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\Selenium\\drivers\\version79\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign in']"));
		ele.sendKeys(Keys.chord(Keys.CONTROL+"a"));
		
		Thread.sleep(5000);
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		for (WebElement link : alllinks) {
			String url = link.getAttribute("href");
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.connect();
			if (con.getResponseCode() > 400) {
				System.out.println(url + "Bad link");
			} else
				System.out.println(url + "Good link");
		}
		driver.quit();
	}

}
