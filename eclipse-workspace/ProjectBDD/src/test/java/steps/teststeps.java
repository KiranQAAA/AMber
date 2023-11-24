package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class teststeps {

	
	
	@Given("user is at login page")
	public void user_is_at_login_page() {

	    System.out.println("user is at login page");
	}

	@When("user enters username")
	public void user_enters_username() {
      System.out.println("user enters username");
	   
	}

	@When("user enters password")
	public void user_enters_password() {
	
	    System.out.println("user enters password");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    System.out.println("user click on login button");
	}

	@Then("user redirects to home page")
	public void user_redirects_to_home_page() {
	   System.out.println("user redirects to home page");
	}

}
