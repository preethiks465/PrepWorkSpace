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

	public static CloseableHttpResponse get(String URI) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(URI);
		CloseableHttpResponse res = httpClient.execute(httpGet);
		return res;
	}

	public CloseableHttpResponse getWithHeaders(String URI, HashMap<String, String> headers)
			throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(URI);
		Set<Entry<String, String>> entries = headers.entrySet();
		for (Entry<String, String> e : entries) {
			httpGet.addHeader(e.getKey(), e.getValue());
		}
		CloseableHttpResponse HttpResp = httpClient.execute(httpGet);
		return HttpResp;
	}

	public CloseableHttpResponse post(String URI, String entityString, HashMap<String, String> headers)
			throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(URI);
		Set<Entry<String, String>> entries = headers.entrySet();
		for (Entry<String, String> entry : entries) {
			httpPost.setHeader(entry.getKey(), entry.getValue());
		}
		httpPost.setEntity(new StringEntity(entityString));
		CloseableHttpResponse res = httpClient.execute(httpPost);
		return res;

	}
}
