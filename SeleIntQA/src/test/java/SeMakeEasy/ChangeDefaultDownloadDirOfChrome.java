package SeMakeEasy;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChangeDefaultDownloadDirOfChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		// Setting new download directory path
		Map<String, Object> prefs = new HashMap<String, Object>();
		// Use File.separator as it will work on any OS
		prefs.put("download.default_directory",
				System.getProperty("user.dir") + File.separator + "externalFiles" + File.separator + "downloadFiles");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		// Launching browser with desired capabilities
		ChromeDriver driver = new ChromeDriver(options);
		// URL loading
		driver.get("https://www.seleniumhq.org/download/");
		// Click on download selenium server jar file
		driver.findElement(By.xpath("//p[text()='Download version ']/a")).click();
	}

}
