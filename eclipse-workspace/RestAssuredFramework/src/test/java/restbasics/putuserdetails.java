package restbasics;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class putuserdetails {
@Test
public void Putuserdetails() {
	RestAssured.baseURI="https://reqres.in/";
	Response  r= given()
	.body("{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"Indian resident\"\r\n"
			+ "}")
	.when()
	.put("/api/users/2")
	.then()
	.extract()
	.response();
	String s=r.asPrettyString();
	System.out.println(s);
}
}
