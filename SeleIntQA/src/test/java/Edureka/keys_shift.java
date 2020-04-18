package Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keys_shift {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		if((driver.findElements(By.xpath("//input[@name='email']"))).size()>0) {
			System.out.println("Element Visible");
		}
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		Actions builder = new Actions(driver);
		Action series = builder.moveToElement(email).keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).doubleClick(email)
				.build();
		series.perform();
	}

}
