package com.qa.base;

import java.io.*;
import java.util.Properties;

public class TestBase {
	public int RESPONSE_STATUS_CODE_200=200;
	public int RESPONSE_STATUS_CODE_201=201;
	public Properties Prop;

	public  TestBase() {

		try {
			Prop = new Properties();
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + File.separator + "src"
					+ File.separator + "main" + File.separator + "java" + File.separator + "com" + File.separator + "qa"
					+ File.separator + "config" + File.separator + "config.properties");
			Prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
