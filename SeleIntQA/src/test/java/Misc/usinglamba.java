package Misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class usinglamba {

	public static void main(String[] args) {
		List<String> links = new ArrayList<String>();
		Set<String> hset = new HashSet<String>();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElements(By.tagName("a"))
		.stream()
		.map(productWebElement -> productWebElement.getText())
		.distinct()
		.collect(Collectors.toList())
		.forEach(System.out::println);
		// driver.findElements(By.tagName("a")).stream().forEach(link ->
		// link.getText()).collect(Collectors.toList()).forEach(System.out::println);
	}

}
