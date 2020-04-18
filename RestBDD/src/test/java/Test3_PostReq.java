import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Test3_PostReq {
	@Test
	public void postreq() {
		given().header("Content-Type", "application/json").param("name", "kripri").param("job", "lecturer").
		when().post("https://reqres.in/api/users").then().statusCode(201);
	}
}
