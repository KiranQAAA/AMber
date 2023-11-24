package restbasics;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class ValidateHeader {
	//PMAK-64ca3309e902bd0043353979-1eedca86d7d9f4275f3f4b9d91503f34eb
	
	
	@Test
	public void getAllWorkspaces()
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		
		Response response = given()
				.header("x-api-key","PMAK-64ca3309e902bd0043353979-1eedca86d7d9f4275f3f4b9d91503f34eb")
				.get("/workspaces")
				
				.then()

				.extract()

				.response();

               String resp = response.asPrettyString();

              System.out.println(resp);
	}

		

}
