package restbasics;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class validateHeaderForsingleworkspace {
	@Test
	public void getAWorkspaceDetail()
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		
		Response response = given()
		
							.header("x-api-key", "PMAK-64ca3309e902bd0043353979-1eedca86d7d9f4275f3f4b9d91503f34eb")
		
							.when()
		
							.get("/workspaces/732c3163-8139-477f-b075-2aa06825db41")
		
							.then()
		
							.extract()
			
							.response();
		
		String resp = response.asPrettyString();
		
		System.out.println(resp);
		
		
	}

}
