package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Billingsteps {
	@Given("user is on billing page")
	public void user_is_on_billing_page() {
	   System.out.println();
	}

	@When("user enters billing amount {int}")
	public void user_enters_billing_amount(Integer int1) {
		   System.out.println();

	}

	@When("user enters tax amount {int}")
	public void user_enters_tax_amount(Integer int1) {
		   System.out.println();

	}

	@When("user clicks on calculate button")
	public void user_clicks_on_calculate_button() {
		   System.out.println();

	}

	@Then("it gives the final amount {int}")
	public void it_gives_the_final_amount(Integer int1) {
		   System.out.println();

	    	}

	@When("user enters tax amount {double}")
	public void user_enters_tax_amount(Double double1) {
		   System.out.println();

	   
	}

	@Then("it gives the final amount {double}")
	public void it_gives_the_final_amount(Double double1) {
		   System.out.println();

	   
	}


}
