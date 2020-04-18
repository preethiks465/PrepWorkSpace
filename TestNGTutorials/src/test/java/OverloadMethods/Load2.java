package OverloadMethods;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Load2 {

	@Parameters ({"browser"})
	@Test 
	public void test1(String browser) {
		System.out.println(browser);
	}
	
	@Parameters ({"student","browser"})
	@Test 
	public void test1(String browser,String student) {
		System.out.println(browser+student);
	}
	
	

}
