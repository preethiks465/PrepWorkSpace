package ExtentReportUtil;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportManager {
	private static ExtentReports extent;
	public ExtentTest test;
	public static String fName;
	public static String path1;
	//public WebDriver driver;
	
	public WebDriver driver; 
	public static ExtentReports getInstance()
	{
		if (extent == null) 
		{
			Date d=new Date();
			String fileName=d.toString().replace(":", "_").replace(" ", "_")+".html";
			extent = new ExtentReports(fileName, true, DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
			extent.addSystemInfo("Selenium Version", "3.12.0");
			fName=fileName;
		}
		return extent;
	}
	
	public static String fileName1()
	{
		return fName;
	}
}
