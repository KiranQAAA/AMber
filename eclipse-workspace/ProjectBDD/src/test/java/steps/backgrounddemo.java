package steps;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class backgrounddemo {

@Given("this is given statement")
public void this_is_given_statement() {
  System.out.println("Given");
}

@When("this is a  account page")
public void this_is_a_account_page() {
 System.out.println("When 1"); 
}

@Then("this is result")
public void this_is_result() {
  System.out.println("Then 1"); 
}

@When("this is a user on add page")
public void this_is_a_user_on_add_page() {
	System.out.println("When 2");
}

@Then("user is added")
public void user_is_added() {
	System.out.println("When 2");
}




}
