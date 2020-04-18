package Edureka;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		/*
		 * new WebDriverWait(driver, 20).until( webDriver -> ((JavascriptExecutor)
		 * webDriver).executeScript("return document.readyState").equals("complete"));
		 */
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(src, new File("C:\\Users\\PreethikrishnaSankur\\Desktop\\shot.png"));
		}
		catch(IOException e)
		{}
		
	}

}
