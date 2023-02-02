package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario_outline2_steps {
	@When("user3 enters <{string}> in username field")
	public void user3_enters_in_username_field(String string) {
		System.out.println(string+"*");
	    	}

	@When("user3 enters <{string}> in password field")
	public void user3_enters_in_password_field(String string) {
		System.out.println(string+"*");

	}

	@Then("user3 we will check")
	public void user3_we_will_check() {
		System.out.println("checking completed");
	}
}
