package restbasics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class validateResponccode {
	@Test
	public void PostUserDetails()
	{
		RestAssured.baseURI="https://reqres.in/";
		Response responce=given().body("{\r\n"
				+ "    \"name\": \"Jon\",\r\n"
				+ "    \"job\": \"Smith\"\r\n"
				+ "}")
		.when()
		.post("/api/users")
		.then()
		.extract().response();
		int code =responce.statusCode();
		System.out.println(responce.statusCode());
		Assert.assertEquals(code, 201);
		System.out.println("Status received => " + responce.getStatusLine()); 
		System.out.println("Response=>" + responce.prettyPrint());
     long timevalue = responce.getTime();
		
		System.out.println("Timevalue received => " + timevalue);


	}
}
