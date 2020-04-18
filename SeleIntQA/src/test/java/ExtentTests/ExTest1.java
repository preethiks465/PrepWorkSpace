package ExtentTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ExtentReportUtil.CopyFile;
import ExtentReportUtil.ExtentReportManager;

public class ExTest1 extends Screenshot{
	
	public static ExtentTest test;
	public ExtentReports rep = new ExtentReportManager().getInstance();
	//public static WebDriver driver;
	@Test
	public void test123() {
		test = rep.startTest("my test");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		test.log(LogStatus.PASS,"step 1", "Opening Browser");
		driver.get("http://www.google.com");
		test.log(LogStatus.PASS,"step 2", "Navigating to Google Chrome");
		ScreenShot();
		
	}
	
	@AfterTest
	public void quit()
	{
		if(rep!=null)
		{
			rep.endTest(test);
			rep.flush();
			// The above two lines are compulsory else reports will not be generated
		}
		CopyFile.copyFileFromReports();
	}
	

}
