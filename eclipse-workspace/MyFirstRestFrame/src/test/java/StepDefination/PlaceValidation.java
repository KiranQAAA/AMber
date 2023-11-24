package StepDefination;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import restbasics.AddPlace;
import restbasics.Location;

public class PlaceValidation {
	@Given("Add place payload")
	public void add_place_payload() {
		RestAssured.baseURI="https://rahulshettyacademy.com";

		AddPlace p =new AddPlace();
		p.setAccuracy(50);
		p.setAddress("29, side layout, cohen 09");
		p.setLanguage("French-IN");
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("https://rahulshettyacademy.com");
		p.setName("Frontline house");
		List<String> myList =new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");

		p.setTypes(myList);
		Location l =new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);

		p.setLocation(l);
		Response res=given().log().all().queryParam("key", "qaclick123")
		.body(p);
	
	    
	}
	@When("user calls {string} with post Http request")
	public void user_calls_with_post_http_request(String string) {
	   System.out.println("User Calls Post API ");
	}
	@Then("Api call is success got status code {int}")
	public void api_call_is_success_got_status_code(Integer int1) {
		 System.out.println("User Gets  status Code 200 "); 
	}
	@Then("{string} in the  responce body Is {string}")
	public void in_the_responce_body_is(String string, String string2) {
		 System.out.println("User gets status  Responce Body  ");
	}
	@Then("{string} in responce body is {string}")
	public void in_responce_body_is(String string, String string2) {
		 System.out.println("User gets scope  Responce Body  ");
	}
	
	
}


