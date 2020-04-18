package ScreenShot_FailedTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class class1 extends BaseClass {
		@BeforeMethod
	public void setup() {
		initialization();
	}

	@Test
	public void test1() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, true);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
