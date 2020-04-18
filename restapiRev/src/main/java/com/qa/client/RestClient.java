package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.qa.base.TestBase;

public class RestClient extends TestBase {

	public void get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		httpGet.setHeader("Authorization", "Basic cHJlZXRoaWtyaXNobmEuc0BhdXRvcmFiaXQuY29tOlFhendzeCQ1NDU0");

		httpGet.setHeader("Content-type", "application/json");

		try {

			UsernamePasswordCredentials creds = new UsernamePasswordCredentials("preethikrishna.s@autorabit.com",
					"Qazwsx$5454");

			httpGet.addHeader(new BasicScheme().authenticate(creds, httpGet, null));
			CloseableHttpResponse responseString = httpClient.execute(httpGet);
			int StatusCode = responseString.getStatusLine().getStatusCode();

			System.out.println("Response Code :::::" + StatusCode);
			String resp_String = EntityUtils.toString(responseString.getEntity());
			JSONObject JSONObj = new JSONObject(resp_String);
			System.out.println("Response JSON" + JSONObj);
			Header[] headers = responseString.getAllHeaders();
			HashMap<String, String> header_map = new HashMap<String, String>();
			for (Header h : headers) {
				header_map.put(h.getName(), h.getValue());
			}
			System.out.println("Response Headers" + header_map);
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) throws ClientProtocolException, IOException {
		RestClient rc = new RestClient();
		rc.get("https://autorabit.atlassian.net/rest/api/2/issue/DXTES-3");
		rc.get("https://autorabit.atlassian.net/rest/api/2/search?jql=project%20%3D%20"+10010+"&maxResults=5000");
	}
}
