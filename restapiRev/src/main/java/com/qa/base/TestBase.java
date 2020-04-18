package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase  {
	public int RESPONSE_STATUS_CODE_200=200;
	public int RESPONSE_STATUS_CODE_201=201;
	public Properties prop;
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + File.separator + "src"
					+ File.separator + "main" + File.separator + "java" + File.separator + "com" + File.separator + "qa"
					+ File.separator + "config" + File.separator + "config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
