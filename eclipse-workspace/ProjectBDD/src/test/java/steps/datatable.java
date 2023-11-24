package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class datatable {

	
	@Given("User should be at the accounts page")
	public void user_should_be_at_the_accounts_page() {
	    System.out.println(" Accounts page ");
	}

	@When("User enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {
		 List<List<String>> data=dataTable.asLists(String.class);
		 List<String> name=data.get(0);
		 List<String>last_name=data.get(1);
		  int length =data.size();
		 
		 System.out.println("name :  "+name + "last name: "+last_name);
		 
		System.out.println(" enter data in the form   ");
		
	/*
		for(int i=0;i<=length;i++)//rows
		{
			for (int j=i;j<length;j++)
			{
				System.out.println(data.get(i));
			}
		}*/
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println(" enter submit  ");
	}

	@Then("User should see the account number")
	public void user_should_see_the_account_number() {
		System.out.println(" account number visible ");
	}

}
