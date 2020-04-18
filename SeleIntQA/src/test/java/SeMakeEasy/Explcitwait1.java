package SeMakeEasy;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explcitwait1 {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));
		
		
		
		String foo = wait.until(new Function<WebDriver, String>() {

			@Override
			public String apply(WebDriver t) {
				// TODO Auto-generated method stub
				return null;
			}
			
		});

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pre");

	}

	public void exampleOfFluentWait() {
		WebElement foo = driver.findElement(By.id("foo"));
		new FluentWait<WebElement>(foo).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS)
				.until(new Function<WebElement, String>() {
					@Override
					public String apply(WebElement element) {
						return element.getText();
					}
				});
	}

}
