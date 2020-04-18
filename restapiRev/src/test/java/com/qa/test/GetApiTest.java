package com.qa.test;

import java.io.IOException;
import java.util.Properties;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetApiTest extends TestBase {
	TestBase testbase;
	RestClient restclient;
	String ServiceUrl;
	String ApiUrl;
	String url;

	@BeforeMethod
	public void Setup() {
		testbase = new TestBase();
		ServiceUrl = prop.getProperty("serviceurl");
		ApiUrl = prop.getProperty("apiurl");
		url = ServiceUrl + ApiUrl;
	}

	@Test
	public void getApiTest() throws ClientProtocolException, IOException {
		restclient = new RestClient();
		restclient.get(url);
	}
}
