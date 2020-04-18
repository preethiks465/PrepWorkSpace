package Gridtest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid2 {

	public static void main(String[] args) {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		//cap.setCapability(ChromeOptions.CAPABILITY, options);
		String nodeUrl = "http://172.16.0.211:11482/wd/hub";
		try {
			WebDriver driver = new RemoteWebDriver(new URL(nodeUrl), cap);
			driver.manage().window().setSize(new Dimension(1800, 900));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://pilot.autorabit.com/");
			driver.close();
		} catch (MalformedURLException e) {
		}
		

	}

}
