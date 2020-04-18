package OverloadMethods;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Load1 {

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test(dataProvider = "data")
	public void test1(String s) {
		s = "pree";
		System.out.println("test2" + s);
	}

	@DataProvider
	public Object[][] data() {
		return new Object[][] { { "abc" }, { "pqr" } };

	}

}
