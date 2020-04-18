package getingeOpenIssues;

import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ObserveSalesCoach {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	Date today = Calendar.getInstance().getTime();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	private String COUNTRY_DE = "DE";
	private String COUNTRY_US = "US";

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://test.salesforce.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testObserveSalesCoach() throws Exception {
		driver.get(baseUrl + "/");
		try {
			driver.findElement(By.xpath("//input[@id='username']")).clear();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("de_salesuser_taf@getingegroup.com.qa");
			driver.findElement(By.xpath("//input[@id='password']")).clear();
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test!23Automation");
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			String country = new String(driver.findElement(By.xpath("//span[@id='userNavLabel']")).getText().substring(4, 6));

			driver.findElement(By.xpath("//li[@id='Opportunity_Tab']/a")).click();
			driver.findElement(By.xpath("//select[@id='fcf']")).click();
			new Select(driver.findElement(By.xpath("//select[@id='fcf']"))).selectByVisibleText("My Opportunities_autotest");
			driver.findElement(By.xpath("//select[@id='fcf']")).click();
			if (isElementPresent(By.xpath("//td[4]/div/a/span"))) {
				driver.findElement(By.xpath("//td[4]/div/a/span")).click();
			} else {
				driver.findElement(By.xpath("//input[@name='go']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//td[4]/div/a/span")).click();
			}
			Thread.sleep(3000);
			if (country.equals(COUNTRY_DE)){
				String name = new String(driver.findElement(By.xpath("//td[2]/input[6]")).getAttribute("name"));
				driver.findElement(By.xpath("//td[2]/input[6]")).click();
			} else if (country.equals(COUNTRY_US)){
				/*TODO: click on sales guidelines */
			}
			Thread.sleep(3000);
			driver.switchTo().window("");
			WebElement iframe = driver.findElement(By.xpath("//div[@class='middle']/div[1]/div[1]/iframe[1]"));
			driver.switchTo().frame(iframe);
			String title = new String(driver.getTitle());
			String stage1 = new String(driver.findElement(By.xpath("//label[contains(text(),'Stage Name')]/following::select")).getAttribute("value"));
			Thread.sleep(3000);
			driver.switchTo().parentFrame();
		    driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
			driver.findElement(By.xpath("//div[@id='opp11_ileinner']")).click();

			Actions actiondc = new Actions(driver);
			WebElement btnElement = driver.findElement(By.xpath("//div[@id='opp11_ileinner']"));
			actiondc.doubleClick(btnElement).perform();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='InlineEditDialog']")).click();
			driver.findElement(By.xpath("//div[@id='opp11_ileinneredit']/span/select")).click();
			new Select(driver.findElement(By.xpath("//div[@id='opp11_ileinneredit']/span/select"))).selectByVisibleText("Analyse");
			driver.findElement(By.xpath("//div[@id='opp11_ileinneredit']/span/select")).click();
			driver.findElement(By.xpath("//input[@value='OK']")).click();
			driver.findElement(By.xpath("//input[@name='inlineEditSave']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//td[2]/input[6]")).click();
			iframe = driver.findElement(By.xpath("//div[@class='middle']/div[1]/div[1]/iframe[1]"));
			driver.switchTo().frame(iframe);
			String stage2 = new String(driver.findElement(By.xpath("//label[contains(text(),'Stage Name')]/following::select")).getAttribute("value"));
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
			Thread.sleep(3000);
			if (stage1.equals(stage2)) {
				createResult("Fail", "Sales coach shows wrong information");
			} else {
				String result = sdf.format(today) + " auto test result";
				createResult("Pass", result);
			}

		} catch (Exception e) {
			createResult("Fail", e.getMessage());
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
		driver.findElement(By.xpath("//input[@id='phSearchInput']")).sendKeys("1904-7479");
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
