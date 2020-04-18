package com.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

/*LOG: Info/Activities during program execution
4 levels of logs are: Debug,Fatal,Info,Warning
Log 4j generates the logs by reading log 4j configuration from log 4j properties file
ConsoleAppender(log4j.properties) appends to console
 RollingFileAppender appends to application.log
if append = true, the logs get appended to the previous logs in application.log and
if append=false,the logs get override in application.log*/

public class logintest {
	WebDriver driver;
	Logger log = Logger.getLogger(logintest.class);
	@BeforeMethod
	public void setup() {
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\version79\\chromedriver.exe");
		//driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://www.crmpro.com");
	}

	@Test(priority = 1)
	public void titletest() {
		log.info("*********************test1********************");
		Assert.assertEquals(driver.getTitle(),
				"CRMPRO - CRM software for customer relationship management, sales, and support.");
		log.info("***********End of test************************");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
