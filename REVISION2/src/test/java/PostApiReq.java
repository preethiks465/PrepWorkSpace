import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
//import com.qa.data.Users;
import com.qa.data.pages;
import com.qa.data.users;

public class PostApiReq {
	TestBase testbase;
	CloseableHttpResponse resp;
	String APIUrl;
	String ServiceUrl;
	String Url;
	RestClient client;
	pages pag;
	users user;

	@BeforeMethod
	public void setup() throws IOException {
		testbase = new TestBase();
		APIUrl = testbase.prop.getProperty("APIUrl");
		ServiceUrl = testbase.prop.getProperty("ServicePostURL");
		Url = APIUrl + ServiceUrl;
	}

	@Test
	public void PostApiReqTest() throws ClientProtocolException, IOException {
		client = new RestClient();
		HashMap<String, String> hmap = new HashMap<String, String>();
		ObjectMapper mapper = new ObjectMapper();

		hmap.put("Content-Type", "application/json");

		user = new users("krishna12", "god");
		String entityString = mapper.writeValueAsString(user);
		resp = client.post(Url, hmap, entityString);
		Assert.assertEquals(resp.getStatusLine().getStatusCode(), testbase.RESPONSECODE_201);

		String res = EntityUtils.toString(resp.getEntity(), "UTF-8");
		/*
		 * JSONObject json = new JSONObject(res); System.out.println(json);
		 */
		users usersj = mapper.readValue(res, users.class);
		Assert.assertEquals(user.getName(), usersj.getName());
	}
}
