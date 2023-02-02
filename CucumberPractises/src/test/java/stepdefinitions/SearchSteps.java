package stepdefinitions;

import Amazonimplementation.Product;
import Amazonimplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SearchSteps {
	Product product;
	Search search;
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
	    System.out.println("Step1:I am on search Page");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String Productname, Integer price) {
		System.out.println("step2:Search the product with name :"+Productname+" Price:"+price);
		product=new Product(Productname,price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String Productname) {
		System.out.println("step3: product:"+ Productname +" is displayed");
		search=new Search();
		String name=search.displayProduct(product);
		System.out.println("searched product is :"+ name);
		Assert.assertEquals(product.getProductName(),name);
		
	}
}
