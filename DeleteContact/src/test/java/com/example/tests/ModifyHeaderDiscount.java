package com.example.tests;

import static org.junit.Assert.fail;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.rabit.testgen.util.RecorderUtil;

public class ModifyHeaderDiscount {
private EventFiringWebDriver driver;
  private RecorderUtil recorderObj= new RecorderUtil();
  private String title;
private String assertionData;
private String[]  testData = new String [20];

	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private String COUNTRY_DE = "DE";
	private String COUNTRY_US = "US";
	private String COUNTRY_AU = "AU";
	Date today = Calendar.getInstance().getTime();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

	@Before
	public void setUp() throws Exception {
String path= this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath() + File.separator;
	String package1 = this.getClass().getPackage().getName();
	String [] parts= package1.split("\\.");
	for (int i = 0; i < parts.length; i++) {
	String part = parts[i];
	if(parts.length == i) {
	path = path + part;
	} else {
	path = path + part + File.separator;
	}
	}
	driver= recorderObj.Browser("autorabit.com-FQRgIs","ModifyHeaderDiscount",path) ;
	recorderObj.setDriver(driver);
	driver.manage().window().maximize();

		baseUrl = "https://test.salesforce.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testModifyHeaderDiscount() throws Exception {

	 try{
	Actions action = new Actions(driver);
		try {
	
			Thread.sleep(10000);
			String country = new String(driver.findElement(By.xpath("//span[@id='userNavLabel']")).getText().substring(4, 6));
	recorderObj.logMessage("Storing Variable: country = "+country);
	
			String currdelimiter = ".";
			int currlength = 4;
				driver.findElement(By.xpath("//li[@id='01r1o0000003o0S_Tab']/a")).click();
	
				driver.findElement(By.xpath("//select[@id='fcf']")).click();
	
				new Select(driver.findElement(By.xpath("//select[@id='fcf']"))).selectByVisibleText("My Quotes_autotest");recorderObj.waitSeconds(2);
	
			Thread.sleep(2000);
			if (isElementPresent(By.xpath("//td[4]/div/a/span"))) {
					driver.findElement(By.xpath("//td[4]/div/a/span")).click();
	
			} else {
					driver.findElement(By.xpath("//select[@id='fcf']")).click();
	
					driver.findElement(By.xpath("//input[@name='go']")).click();
	
				Thread.sleep(2000);
					driver.findElement(By.xpath("//td[4]/div/a/span")).click();
	
			}
			Thread.sleep(10000);
			/* get old quote value */
			String value_old = new String(driver.findElement(By.xpath("//span[@id='j_id0:mainForm:j_id45:j_id57:j_id74:j_id76']")).getText());
	recorderObj.logMessage("Storing Variable: value_old = "+value_old);
	
			/* open product configurator */
				driver.findElement(By.xpath("//td[@id='j_id0:mainForm:j_id45:j_id46:bottom']/input[3]")).click();
	
			Thread.sleep(4000);
			driver.switchTo().frame("quoteAssistantIFrame");
			/* click on calculation tab */
				driver.findElement(By.xpath("//td[2]/table/tbody/tr/td[2]/em/button/img")).click();
	
			Thread.sleep(5000);
			/* expand quote main folder */
				driver.findElement(By.xpath("//td[2]/div/div/div/img[2]")).click();
	
			Thread.sleep(3000);
			/* click on manual header discount % and set it to 10% */
			String elemId = new String(driver.findElement(By.xpath("//div/table/tbody/tr/td[18]/div/div")).getAttribute("id"));
	recorderObj.logMessage("Storing Variable: elemId = "+elemId);
	
			Actions action1 = new Actions(driver);
			action1.moveToElement(driver.findElement(By.xpath("//div[@id='" + elemId + "']"))).doubleClick().build().perform();
			driver.findElement(By.xpath("//div[2]/div/input")).sendKeys(Keys.CONTROL + "a");
			driver.findElement(By.xpath("//div[2]/div/input")).sendKeys(Keys.DELETE);
				driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("10");
				driver.findElement(By.xpath("//div[@id='" + elemId + "']/preceding::td")).click();
	
			String discount = new String(driver.findElement(By.xpath("//div/table/tbody/tr/td[18]/div/div")).getText());
	recorderObj.logMessage("Storing Variable: discount = "+discount);
	
			String discountedValue = new String(driver.findElement(By.xpath("//div/table/tbody/tr/td[21]/div/div")).getText());
	recorderObj.logMessage("Storing Variable: discountedValue = "+discountedValue);
	
			/* click on manual header discount and set it to 20 */
			elemId = driver.findElement(By.xpath("//div/table/tbody/tr/td[19]/div/div")).getAttribute("id");

			action1.moveToElement(driver.findElement(By.xpath("//div[@id='" + elemId + "']"))).doubleClick().build().perform();
			driver.findElement(By.xpath("//div[3]/div/input")).sendKeys(Keys.CONTROL + "a");
			driver.findElement(By.xpath("//div[3]/div/input")).sendKeys(Keys.DELETE);
				driver.findElement(By.xpath("//div[3]/div/input")).sendKeys("20");
				driver.findElement(By.xpath("//div[@id='" + elemId + "']/following::td")).click();
	
			String absDiscount = new String(driver.findElement(By.xpath("//div/table/tbody/tr/td[19]/div/div")).getText());
	recorderObj.logMessage("Storing Variable: absDiscount = "+absDiscount);
	
			String finalValue = new String(driver.findElement(By.xpath("//div/table/tbody/tr/td[21]/div/div")).getText());
	recorderObj.logMessage("Storing Variable: finalValue = "+finalValue);
	
			/* clicking on Get SAP prices */
				driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
	
			Thread.sleep(10000);
			/* clicking on save */
			driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//input[@id='j_id0:mainForm:j_id35']")).click();
	
			Thread.sleep(5000);
			/* get quote value in GForce */

			if (isElementPresent(By.xpath("//div[@class='messageText']"))) {
				String errormessage = new String(driver.findElement(By.xpath("//div[@class='messageText']")).getText());
	recorderObj.logMessage("Storing Variable: errormessage = "+errormessage);
	
				if(!errormessage.contains("Saving quote")){
					createResult("Fail", errormessage);
				} else {
					String value = new String(driver.findElement(By.xpath("//span[@id='j_id0:mainForm:j_id45:j_id57:j_id74:j_id76']")).getText());
	recorderObj.logMessage("Storing Variable: value = "+value);
	
					
					value_old = value_old.substring(currlength).replace(currdelimiter, "");
					value = value.substring(currlength).replace(currdelimiter, "");
					discount = discount.replace("%", "");
					absDiscount = absDiscount.replace(currdelimiter, "");
					if (country.equals(COUNTRY_DE)){
						value_old = value_old.replace(",", ".");
						value = value.replace(",", ".");
						discount = discount.replace(",", ".");
						absDiscount=absDiscount.replace(",", ".");
					}
					double oldprice = Double.valueOf(value_old);
					double disc = Double.valueOf(discount);
					double absdisc = Double.valueOf(absDiscount);
					double calc = (oldprice*(100-disc)/100)-absdisc;
					
					BigDecimal newprice = new BigDecimal(value);
					newprice = newprice.setScale(2, BigDecimal.ROUND_HALF_UP);
					BigDecimal newpricecalc = new BigDecimal(calc);
					newpricecalc = newpricecalc.setScale(2, BigDecimal.ROUND_HALF_UP);

					if (newprice.compareTo(newpricecalc) == 0){ 
						createResult("Pass", "Old value "+value_old+ " and new " +value+ " are different, discount was: " + disc+ "% and "+absdisc+ "total. Testdate: "+sdf.format(today)); 
					}else { 
						createResult("Fail", "Old and new quote net total are similar, setting discounts failed: "+ oldprice + " versus new calculation: " + newprice + " Calculated value: "+newpricecalc + " double value: "+calc); 
					}
				
				}
			}else {
				String value = new String(driver.findElement(By.xpath("//span[@id='j_id0:mainForm:j_id45:j_id57:j_id74:j_id76']")).getText());
	recorderObj.logMessage("Storing Variable: value = "+value);
	
				/* TODO: add calculation */
				if (!value.equals(value_old)){ 
					createResult("Pass", "Old value "+value_old+ " and new " +value+ " are different. Testdate: "+sdf.format(today)); 
				}else { 
					createResult("Fail", "Old and new quote net total are similar, setting discounts failed."); 
				}
			
			}
		} catch (Exception e) {
			createResult("Fail", e.getMessage());
			throw e;
		}
	}

	catch (AssertionError e){
	recorderObj.screenshot(e);
	if(e.getMessage().contains("\n")){
		fail(e.getMessage().substring(0, e.getMessage().indexOf("\n")));
		}
		else fail(e.getMessage());
	}
	catch (Exception e){
	recorderObj.screenshot(e);
	if(e.getMessage().contains("\n")){
		fail(e.getMessage().substring(0, e.getMessage().indexOf("\n")));
		}
		else fail(e.getMessage());
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

			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testresult_taf@getingegroup.com.requests");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TestAutomation.23");
			driver.findElement(By.xpath("//input[@id='Login']")).click();
	
		Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@id='phSearchInput']")).click();
	
			driver.findElement(By.xpath("//input[@id='phSearchInput']")).sendKeys("1905-7557");
			driver.findElement(By.xpath("//input[@id='phSearchButton']")).click();
	
		Thread.sleep(3000);
			driver.findElement(By.xpath("//tr[2]/th/a")).click();
	
			driver.findElement(By.xpath("//div[3]/a/span")).click();
	
			driver.findElement(By.xpath("//input[@name='new00N26000000LDV6']")).click();
	
			driver.findElement(By.xpath("//select[@id='00N26000000LDWv']")).click();
	
			new Select(driver.findElement(By.xpath("//select[@id='00N26000000LDWv']"))).selectByVisibleText(outcome);recorderObj.waitSeconds(2);
	
			driver.findElement(By.xpath("//select[@id='00N26000000LDWv']")).click();
	
			driver.findElement(By.xpath("//textarea[@id='00N26000000LDWt']")).click();
	
		driver.findElement(By.xpath("//textarea[@id='00N26000000LDWt']")).sendKeys(description);
			driver.findElement(By.xpath("(//input[@name='save'])[2]")).click();
	
		Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='userNavButton']/span")).click();
	
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	
	}
}
