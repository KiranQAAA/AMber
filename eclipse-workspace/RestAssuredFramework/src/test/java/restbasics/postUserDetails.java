package restbasics;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class postUserDetails {
@Test
public void PostUserDetails()
{
	RestAssured.baseURI="https://reqres.in/";
	String Responce =given().body("{\r\n"
			+ "    \"name\": \"Jon\",\r\n"
			+ "    \"job\": \"Smith\"\r\n"
			+ "}")
	.when()
	.post("/api/users")
	.then()
	.extract().asPrettyString();
	
	System.out.println(Responce);
}
}
