
//package com.getinge.automation.locadmin;

import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DeleteContact {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	Date today = Calendar.getInstance().getTime();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	private String COUNTRY_DE = "DE";
	private String COUNTRY_US = "US";
	private String COUNTRY_AU = "AU";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PreethikrishnaSankur\\PREP\\XpathTutorials\\src\\main\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		baseUrl = "https://login.salesforce.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testDeleteContact() throws Exception {
		driver.get(baseUrl + "/");
		try {
			driver.findElement(By.xpath("//input[@id='username']")).clear();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("preethisa@autorabit.com");
			driver.findElement(By.xpath("//input[@id='password']")).clear();
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Aug@1234");
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			Thread.sleep(6000);
			String currurl = driver.getCurrentUrl();
			driver.get(currurl+"?source=lex");
			String country = new String(
					driver.findElement(By.xpath("//span[@id='userNavLabel']")).getText().substring(4, 6));
			/* Go to Contacts Tab */
			driver.findElement(By.xpath("//li[@id='Contact_Tab']/a")).click();
			/* select my own contacts */
			driver.findElement(By.xpath("//select[@id='fcf']")).click();
			new Select(driver.findElement(By.xpath("//select[@id='fcf']"))).selectByVisibleText("My Contacts");

			/* get the name from the first contact */
			String name = new String();
			if (isElementPresent(By.xpath("//td[4]/div/a/span"))) {
				name = driver.findElement(By.xpath("//td[4]/div/a/span")).getText();
			} else {
				driver.findElement(By.xpath("//select[@id='fcf']")).click();
				driver.findElement(By.xpath("//input[@name='go']")).click();
				name = driver.findElement(By.xpath("//td[4]/div/a/span")).getText();
			}
			/* click on delete and confirm deletion */
			try {
				driver.findElement(By.xpath("//td[3]/div/a[2]/span")).click();
				acceptNextAlert = true;
				closeAlertAndGetItsText();
			} catch (Exception e) {

			}
			Thread.sleep(5000);
			/* verify the result */

			boolean deleted = !isElementPresent(By.xpath("//span[contains(text(),'" + name + "')]"));

			if (deleted) {
				String result = sdf.format(today) + " :Contact successfully deleted";
				// createResult("Pass", result);
			} else {
				String result = sdf.format(today) + " :Contact has not been deleted";
				// createResult("Fail", result);
			}

		} catch (Exception e) {
			// createResult("Fail", e.getMessage());
			throw e;
		}
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}

	private void createResult(String outcome, String description) throws Exception {

		String toolkitUrl = "https://gforce--requests.cs81.my.salesforce.com/";

		driver.get(toolkitUrl + "/");

		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testresult_taf@getingegroup.com.requests");
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TestAutomation.23");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='phSearchInput']")).click();
		driver.findElement(By.xpath("//input[@id='phSearchInput']")).clear();
		driver.findElement(By.xpath("//input[@id='phSearchInput']")).sendKeys("1910-8048");
		driver.findElement(By.xpath("//input[@id='phSearchButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr[2]/th/a")).click();
		driver.findElement(By.xpath("//div[3]/a/span")).click();
		driver.findElement(By.xpath("//input[@name='new00N26000000LDV6']")).click();
		driver.findElement(By.xpath("//select[@id='00N26000000LDWv']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='00N26000000LDWv']"))).selectByVisibleText(outcome);
		driver.findElement(By.xpath("//select[@id='00N26000000LDWv']")).click();
		driver.findElement(By.xpath("//textarea[@id='00N26000000LDWt']")).click();
		driver.findElement(By.xpath("//textarea[@id='00N26000000LDWt']")).clear();
		driver.findElement(By.xpath("//textarea[@id='00N26000000LDWt']")).sendKeys(description);
		driver.findElement(By.xpath("(//input[@name='save'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='userNavButton']/span")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
}
