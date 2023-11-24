package restbasics;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class headmethod {
	@Test
	public void getAllWorkspaces()
	{  
		
		//we get the status code and size of the header with header value but not the response body
		RestAssured.baseURI = "https://api.getpostman.com";
		
						Response resp = given()
		
							.header("x-api-key", "PMAK-64ca3309e902bd0043353979-1eedca86d7d9f4275f3f4b9d91503f34eb")
		
							.when()
		
							.head("/workspaces")
		
							.then()
		
							.extract()
			
							.response();
						
						int statuscode = resp.statusCode();
						
						
						System.out.println(statuscode);
		

}
}
