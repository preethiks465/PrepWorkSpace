import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test2_RootSetting {

	// @Test
	public void testWithoutRoot() {
		given().get("https://reqres.in/api/user").then().body("data.id[1]", is(2)).body("data.name[0]", is("cerulean"));
	}

	// @Test
	public void withRootSetting() {
		given().get("https://reqres.in/api/user").then().root("data").body("id[1]", is(2)).body("name[0]",
				is("cerulean"));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void detachRoot() {
		given().get("https://reqres.in/api/user").then().root("data").body("id[1]", is(2)).detachRoot("data")
				.body("name[0]", is("cerulean"));

	}
}
