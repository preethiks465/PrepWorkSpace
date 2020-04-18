package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseUtil {
	private BaseUtil base;

	public Hooks(BaseUtil base) {
		this.base = base;
	}

	@Before
	public void initialization() {
		System.out.println("Mock browser Open");
		base.StepInfo="FireFoxDriver";
	}

	@After
	public void teardown() {
		System.out.println("Closing Browser");
	}

}
