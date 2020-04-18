package com.qa.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.PojoClient;
import com.qa.client.RestClient;
import com.qa.data.Users;

public class PostApiTest extends TestBase {
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

	@Test
	public void postApiTest() throws JsonGenerationException, JsonMappingException, IOException {
		restClient = new RestClient();
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("Content-Type", "application/json");
		ObjectMapper mapper = new ObjectMapper();
		Users users = new Users("Pree", "QA");

		// Java Object to JSON file conversion

		mapper.writeValue(
				new File("C:\\Users\\PreethikrishnaSankur\\PREP\\restapi\\src\\main\\java\\com\\qa\\data\\users.json"),
				users);

		String x = new String(Files.readAllBytes(Paths
				.get("C:\\Users\\PreethikrishnaSankur\\PREP\\restapi\\src\\main\\java\\com\\qa\\data\\users.json")));
		// Java Object to JSON file conversion --> String
		System.out.println(x);
		String entityString = mapper.writeValueAsString(users);

		closeableHttpResponse = restClient.post(url, x, hmap);
		int StatusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(StatusCode, testbase.RESPONSE_STATUS_CODE_201);

		String res = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		/*
		 * JSONObject json = new JSONObject(res); System.out.println(json);
		 */
		Users usersj = mapper.readValue(res, Users.class);
		Assert.assertEquals(users.getName(), usersj.getName());
	}

}
