package com.qa.test;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.POJOClient;
import com.qa.client.RestClient;

public class getApiTest {
	TestBase testbase;
	POJOClient pojo;
	String appurl;
	String serviceurl;
	String url;
	RestClient restclient;
	CloseableHttpResponse chttpresp;

	@BeforeMethod
	public void setup() {
		testbase = new TestBase();
		appurl = testbase.prop.getProperty("URL");
		serviceurl = testbase.prop.getProperty("ServiceURL");
		url = appurl + serviceurl;
	}

	@Test(priority = 2, enabled = false)
	public void getResp() throws ClientProtocolException, IOException {
		// restclient = new RestClient();
		chttpresp = restclient.get(url);
		Assert.assertEquals(chttpresp.getStatusLine().getStatusCode(), testbase.RESPONSE_STATUSCODE_200);
		String Response_String = EntityUtils.toString(chttpresp.getEntity(), "UTF-8");
		ObjectMapper mapper = new ObjectMapper();
		pojo = mapper.readValue(Response_String, POJOClient.class);
		System.out.println(pojo.getData().get(2).getAvatar());
		Header[] HeaderArray = chttpresp.getAllHeaders();
		HashMap<String, String> headermap = new HashMap<String, String>();
		for (Header h : HeaderArray) {
			headermap.put(h.getName(), h.getValue());
		}
		System.out.println(headermap);
	}

	@Test(priority = 1)
	public void getWithHeadersResp() throws ClientProtocolException, IOException {
		restclient = new RestClient();
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("Content-Type", "application/json");
		chttpresp = restclient.getWithHeaders(url, hmap);
		Assert.assertEquals(chttpresp.getStatusLine().getStatusCode(), testbase.RESPONSE_STATUSCODE_200);
		String Response_String = EntityUtils.toString(chttpresp.getEntity(), "UTF-8");
		ObjectMapper mapper = new ObjectMapper();
		pojo = mapper.readValue(Response_String, POJOClient.class);
		System.out.println(pojo.getData().get(5).getLast_name());
		Header[] headerarray = chttpresp.getAllHeaders();
		HashMap<String, String> headermap = new HashMap<String, String>();
		for (Header h : headerarray) {
			headermap.put(h.getName(), h.getValue());
		}
		System.out.println(headermap);
	}
}
