package com.qa.client;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonAutoDetect
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class POJOClient implements Serializable {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private List<data> data;

	public int getPage() {
		return this.page;
	}

	public int getPer_page() {
		return this.per_page;
	}

	public int getTotal() {
		return this.total;
	}

	public int getTotal_pages() {
		return this.total_pages;
	}

	public List<data> getData() {
		return this.data;
	}
}
