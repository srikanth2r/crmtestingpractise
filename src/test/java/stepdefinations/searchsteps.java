package stepdefinations;



import amazonImplementaion.Product;
import amazonImplementaion.search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchsteps {
Product prod;
search ser;
	
	@Given("User logs into the application")
	public void user_logs_into_the_application() {
		System.out.println("Hi am on landing page of Amazon");
	    
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enters the credentails");
	   
	}

	@When("User clicks on the login buton")
	public void user_clicks_on_the_login_buton() {
		System.out.println("User logs into the application ");
	  
	}

	@Then("User should be logged in and should be in the home page with amazon logo")
	public void user_should_be_logged_in_and_should_be_in_the_home_page_with_amazon_logo() {
	    System.out.println("user find the Amozon home page");
	    prod=new Product(null, 0);
	}
	@Then("User finds the {string} laptop with price {int}")
	public void user_finds_the_laptop_with_price(String productname, Integer price) {
	System.out.println(productname + " "+ price);
	
	prod=new Product(productname,price);
	ser=new search();
	String name =ser.displayproduct(prod);
	System.out.println(name);
	//assert.assertEquals(prod.getProductname(), name);
	
	   
	}

}
