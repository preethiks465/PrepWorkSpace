package Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserSize {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("s.preethikrishna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Liveall@8787");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		Thread.sleep(2000);
		WebElement x=driver.findElement(By.xpath("//input[@name='Filedata']"));
		Thread.sleep(2000);
				x.sendKeys("D:\\PERSONAL\\PREP\\AGILE\\Agile.txt");
		/*
		 * System.out.println(driver.manage().window().getSize());
		 * //driver.manage().window().maximize(); Dimension d = new Dimension(420,600);
		 * driver.manage().window().setSize(d);
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("window.resizeTo(1024,768);");
		 * System.out.println(driver.manage().window().getSize());
		 * 
		 * driver.quit();
		 */
	}

}
