package com.qa.rest.test;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetcallBDD {

	@Test
	public void test1() {
		given().contentType("sadadfdfs").when().get("https://reqres.in/api/users?page=2").then().assertThat()
				.statusCode(200).and().body("data.id", hasSize(6)).and().header("server", equalTo("cloudflare"));

	}

}
