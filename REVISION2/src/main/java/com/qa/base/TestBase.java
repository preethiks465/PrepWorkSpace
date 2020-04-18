package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public int RESPONSECODE_200 = 200;
	public int RESPONSECODE_201 = 201;
	public Properties prop;

	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/config/config.properties");
		prop.load(fs);
	}

}
