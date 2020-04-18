package StepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.http.auth.Credentials;
//import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginStepDefinition {
	WebDriver driver;
@Before("@smke")
	@Given("^user navigates to gmail login page$")
	public void user_navigates_to_gmail_login_page()  {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.crmpro.com");
	    
	}
	
	@Given("^user dummy$")
	public void user_dummy() {
	    
	    
	}
	@After("@smke")
	@When("^user gives Credentials to login$")
	public void user_gives_Credentials_to_login(DataTable usercredentials) {
		List<Map<String,String>> data = usercredentials.asMaps(String.class, String.class);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get("Username"));
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(data.get(0).get("Password"));
	}
	
	/*
	 * @When("^user gives \"(.*?)\" and \"(.*?)\"$") public void
	 * user_gives_and(String arg1, String arg2) {
	 * driver.findElement(By.name("username")).clear();
	 * driver.findElement(By.name("username")).sendKeys(arg1);
	 * driver.findElement(By.name("password")).clear();
	 * driver.findElement(By.name("password")).sendKeys(arg2);
	 * 
	 * }
	 */


	/*
	 * @When("^user gives username and password$") public void
	 * user_gives_username_and_password() {
	 * driver.findElement(By.name("username")).clear();
	 * driver.findElement(By.name("username")).sendKeys("preethik");
	 * driver.findElement(By.name("password")).clear();
	 * driver.findElement(By.name("password")).sendKeys("Liveall@456");
	 * 
	 * }
	 */

	@Then("^user lands on home page$")
	public void user_lands_on_home_page()  {
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submit);
	    
	}
}
