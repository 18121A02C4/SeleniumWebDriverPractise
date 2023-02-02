package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario_outline_steps {
	@When("user2 enters {int} in username field")
	public void user2_enters_in_username_field(Integer int1) {
	   System.out.println(int1);
	}

	@When("user2 enters {int} in password field")
	public void user2_enters_in_password_field(Integer int1) {
		   System.out.println(int1);

	}

	@Then("we will check")
	public void we_will_check() {
	  System.out.println("we are checking");
	}

}
