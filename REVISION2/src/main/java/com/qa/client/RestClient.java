package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {
	public CloseableHttpResponse get(String URI, HashMap<String, String> headers)
			throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(URI);
		Set<Entry<String, String>> headermap = headers.entrySet();
		for (Entry<String, String> hmap : headermap) {
			httpGet.addHeader(hmap.getKey(), hmap.getValue());
		}
		CloseableHttpResponse res = httpClient.execute(httpGet);
		return res;
	}

	public CloseableHttpResponse post(String URI, HashMap<String, String> headers, String EntityString)
			throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(URI);
		Set<Entry<String, String>> headermap = headers.entrySet();
		for (Entry<String, String> hmap : headermap) {
			httpPost.addHeader(hmap.getKey(), hmap.getValue());
		}
		httpPost.setEntity(new StringEntity(EntityString));
		CloseableHttpResponse res = httpClient.execute(httpPost);
		return res;
	}
}
