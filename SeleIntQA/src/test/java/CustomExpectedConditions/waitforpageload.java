package CustomExpectedConditions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitforpageload extends BaseClass implements ExpectedCondition{

	@Override
	public Boolean apply(Object input) {
		// TODO Auto-generated method stub
		return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
	}

}
