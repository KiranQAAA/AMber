package restbasics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Getuserdetails {
@Test
public void getdetails()
{
	
	
	RestAssured.baseURI="https://reqres.in/";
	Response responce =given()
	.when()
	.get("/api/users?page=2")
	.then()
	.extract()
	.response();
	
	
	String r=responce.asPrettyString();  //ResponseBody that returns a pretty formatted body.
	System.out.println(r);
}
}
