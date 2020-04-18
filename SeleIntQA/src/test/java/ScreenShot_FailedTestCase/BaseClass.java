package ScreenShot_FailedTestCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
public static void initialization() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://www.google.com");
}
public void failed(String MethodName) throws IOException {
		
	File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(srcFile, new File("C:\\Users\\PreethikrishnaSankur\\PREP\\SeleIntQA\\ScreenShots\\"+MethodName+".png"));
} 
}
