package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	// GET Method without Headers
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse res = httpclient.execute(httpget);
		return res;
	}

	// GET Method Headers
	public CloseableHttpResponse get(String url, HashMap<String, String> headermap)
			throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		for (Map.Entry<String, String> header : headermap.entrySet()) {
			httpget.addHeader(header.getKey(), header.getValue());
		}
		CloseableHttpResponse res = httpclient.execute(httpget);
		return res;
	}

	// POST Method
	public CloseableHttpResponse post(String url, String entityString, HashMap<String, String> headermap)
			throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(new StringEntity(entityString));
		for (Map.Entry<String, String> header : headermap.entrySet()) {
			httpPost.addHeader(header.getKey(), header.getValue());
		}
		CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
		return httpResponse;
	}
}
