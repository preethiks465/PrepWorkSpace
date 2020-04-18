import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test1_BasicFeatures {

	/* simply checking status code */

	@Test
	public void teststatuscode() {
		// given().get("http://jsonplaceholder.typicode.com/posts/3").then().statusCode(200).log().all();
		// given().get("https://reqres.in/api/users?page=2").then().body("data.id.get(1)",
		// equalTo(7));
		//given().get("https://reqres.in/api/users?page=1").then().body("data.id", hasItems(7, 8));
		given().param("page", 1).
		header("Content-Type", "application/json").get("https://reqres.in/api/user").then()
				.statusCode(200).log().all();
	}
}
