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
import com.qa.data.pages;

public class GetApiReq {

	TestBase testbase;
	CloseableHttpResponse resp;
	String APIUrl;
	String ServiceUrl;
	String Url;
	RestClient client;
	pages pag;

	@BeforeMethod
	public void setup() throws IOException {
		testbase = new TestBase();
		APIUrl = testbase.prop.getProperty("APIUrl");
		ServiceUrl = testbase.prop.getProperty("ServiceUrl");
		Url = APIUrl + ServiceUrl;
	}

	@Test
	public void GetApiReqTest() throws ClientProtocolException, IOException {
		client = new RestClient();
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("Content-Type", "application/json");
		resp = client.get(Url, hmap);
		Assert.assertEquals(resp.getStatusLine().getStatusCode(), testbase.RESPONSECODE_200);
		ObjectMapper mapper = new ObjectMapper();
		String Entity_Response = EntityUtils.toString(resp.getEntity(), "UTF-8");
		pag = mapper.readValue(Entity_Response, pages.class);
		System.out.println(pag.getData().get(0).getId());
	}

}
