import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GeickoDriverLaunch {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(cap);
		driver.get("http://www.toolsqa.com");
		Thread.sleep(3000);
		driver.quit();
	}

}
