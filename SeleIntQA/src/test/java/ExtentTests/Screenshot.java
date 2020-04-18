package ExtentTests;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReportUtil.ExtentReportManager;
public class Screenshot{
public void ScreenShot() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// decide name - time stamp
	Date d = new Date();
	
	String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
	// String path="Screenshots"+ File.separator + screenshotFile;
	String path = screenshotFile;
	 String path1 = "Images" + File.separator + screenshotFile;
	// take screenshot
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcFile, new File(path));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	// embed it in the reports
	ExTest1.test.log(LogStatus.INFO, ExTest1.test.addScreenCapture(ExtentReportManager.path1));
}

}
