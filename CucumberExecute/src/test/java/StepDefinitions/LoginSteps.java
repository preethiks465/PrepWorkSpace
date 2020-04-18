package StepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import Base.BaseUtil;
import Transform.EmailTransformer;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class LoginSteps extends BaseUtil{
	
	private BaseUtil base;
	public LoginSteps(BaseUtil base) {
		this.base=base;
	}

	@Given("^user navigates to login page$")
	public void user_navigates_to_login_page() {
		System.out.println("the  driver is"+base.StepInfo);
	}

	/*
	 * @When("^user enters username and password$") public void
	 * user_enters_username_and_password() {
	 * 
	 * }
	 */
	@Given("^user enters the email \"(.*?)\"$")
	public void user_enters_the_email(@Transform(EmailTransformer.class)String arg1) {
	    System.out.println(arg1);
	}
	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() {

	}

	@Then("^user should see the userform page$")
	public void user_should_see_the_userform_page() {

	}

	@When("^user enters username and password$")
	public void user_enters_and(DataTable credentials) {
		List<Users> ulist = new ArrayList<Users>();
		ulist = credentials.asList(Users.class);

		for (Users u : ulist) {
			System.out.println(u.username);
			System.out.println(u.password);
		}
	}

	public class Users {
		public String username;
		public String password;

		public Users(String username, String password) {
			this.username = username;
			this.password = password;

		}
	}

	@When("^I enter \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_and(String arg1, String arg2) {
		System.out.println(arg1 + " " + arg2);
	}

}
