import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\version79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.crmpro.com/index.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("preethik");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Liveall@456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("(//table[@class='datacard'])[3]//tr/td"));
		for (int i = 1; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().trim().contentEquals("pqr1 xyz1")) {
				driver.findElement(By.xpath(
						"//a[text()='pqr1 xyz1']//parent::td[@class='datalistrow']//preceding-sibling::td/input[@name='contact_id']"))
						.click();
			}

		}

	}

}
