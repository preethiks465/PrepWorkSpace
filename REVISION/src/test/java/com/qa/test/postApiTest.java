package com.qa.test;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.data.users;

public class postApiTest {

	TestBase testbase;
	CloseableHttpResponse closehttpresp;
	String appurl;
	String serviceurl;
	String url;
	RestClient restclient;
	users user;

	@BeforeTest
	public void Setup() {
		testbase = new TestBase();
		appurl = testbase.prop.getProperty("URL");
		serviceurl = testbase.prop.getProperty("ServicePostURL");
		url = appurl + serviceurl;

	}
	@Test
	public void postreq() throws ClientProtocolException, IOException {
		restclient = new RestClient();
		user = new users("sagar","podlead");
		HashMap<String,String>headermap = new HashMap<String,String>();
		headermap.put("Content-Type", "application/json");
		ObjectMapper mapper = new ObjectMapper();
		String entityString = mapper.writeValueAsString(user);
		closehttpresp= restclient.post(url, entityString, headermap);
		Assert.assertEquals(closehttpresp.getStatusLine().getStatusCode(), testbase.RESPONSE_STATUSCODE_201);
		users user1=mapper.readValue(EntityUtils.toString(closehttpresp.getEntity(), "UTF-8"), users.class);
		System.out.println(user1.getId());
	}

}
