package com.qa.test;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.PojoClient;
import com.qa.client.RestClient;

public class GetApiTest extends TestBase {
	TestBase testbase;
	String serviceurl;
	String apiurl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeableHttpResponse;
	PojoClient pojoClient;

	@BeforeMethod
	public void setup() {
		testbase = new TestBase();
		serviceurl = Prop.getProperty("URL");
		apiurl = Prop.getProperty("ServiceURL");
		url = serviceurl + apiurl;
	}

	@Test(priority = 2)
	public void getAPITest() throws ClientProtocolException, IOException {
		// Creating the RestClient Object
		restClient = new RestClient();
  
		// Generating the closeableHttpResponse by passing the url
		closeableHttpResponse = restClient.get(url);

		// Validating the Status Code
		int StatusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code :::::" + StatusCode);
		Assert.assertEquals(StatusCode, RESPONSE_STATUS_CODE_200, "Status Code is not 200 ");

		/*
		 * Converting the http response to string and then from string to json object
		 * and printing the json response UTF-8 standard corrects any special characters
		 * and returns correct string
		 */
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		JSONObject jsonObj = new JSONObject(responseString);
		System.out.println("Response JSON :::::" + jsonObj);

		// Creating a ObjectMapper object and mapping to PojoClient class
		ObjectMapper mapper = new ObjectMapper();
		pojoClient = mapper.readValue(responseString, PojoClient.class);
		System.out.println(pojoClient.getPer_page());
		System.out.println(pojoClient.getData().get(0).getAvatar());
		System.out.println(pojoClient.getData().get(1).getAvatar());
		// Getting all the headers and storing in a HashMap and printing them
		Header[] headerarray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> headermap = new HashMap<String, String>();
		for (Header h : headerarray) {
			headermap.put(h.getName(), h.getValue());
		}
		System.out.println("Headers Array ::::" + headermap);
	}

	@Test(priority = 1)
	public void getAPITestWithHeaders() throws ClientProtocolException, IOException {
		// Creating the RestClient Object
		restClient = new RestClient();

		// Creating a HeaderMap
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");

		// Generating the closeableHttpResponse by passing the url
		closeableHttpResponse = restClient.get(url, headerMap);

		// Validating the Status Code
		int StatusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code :::::" + StatusCode);
		Assert.assertEquals(StatusCode, RESPONSE_STATUS_CODE_200, "Status Code is not 200 ");

		/*
		 * Converting the http response to string and then from string to json object
		 * and printing the json response UTF-8 standard corrects any special characters
		 * and returns correct string
		 */
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		JSONObject jsonObj = new JSONObject(responseString);
		System.out.println("Response JSON :::::" + jsonObj);

		// Creating a ObjectMapper object and mapping to PojoClient class
		ObjectMapper mapper = new ObjectMapper();
		pojoClient = mapper.readValue(responseString, PojoClient.class);
		System.out.println(pojoClient.getPer_page());

		// Getting all the headers and storing in a HashMap and printing them
		Header[] headerarray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> headermap = new HashMap<String, String>();
		for (Header h : headerarray) {
			headermap.put(h.getName(), h.getValue());
		}
		System.out.println("Headers Array ::::" + headermap);
	}
}
