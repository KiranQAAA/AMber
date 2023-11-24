package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenarioOutlinewithBackground {

	
	@Given("User is at Signup")
	public void user_is_at_signup() {
	   
	}

	@When("User click on create account button")
	public void user_click_on_create_account_button() {

	}

@When("User enters name {string} in the form")
public void user_enters_name_in_the_form(String string) {
   System.out.println("Name :" +string);
}

@When("User enters age {int} inside form")
public void user_enters_age_inside_form(Integer int1) {
    System.out.println("Age :"+int1);
}

@When("User confirms {string} checkbox")
public void user_confirms_checkbox(String string) {
    System.out.println("Gender :"+string);
}

@Then("User gets created")
public void user_gets_created() {
 
}

}
