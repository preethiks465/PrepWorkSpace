package SeleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\version79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/PreethikrishnaSankur/Desktop/books.html");
		// Printing All Headers
		List<WebElement> Headers = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		for (WebElement header : Headers) {
			System.out.println(header.getText());
		}
	}

}
