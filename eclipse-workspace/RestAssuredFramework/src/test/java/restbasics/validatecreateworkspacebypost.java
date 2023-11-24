package restbasics;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class validatecreateworkspacebypost {
	@Test
	public void createAWorkspace()
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		
		Response response = given()
		
		.body("{\r\n"
				+ "    \"workspace\": {\r\n"
				+ "        \"name\": \"RestAssured Workspace\",\r\n"
				+ "        \"type\": \"personal\",\r\n"
				+ "        \"description\": \"This workspace created using RestAssured code \"\r\n"
				+ "    }\r\n"
				+ "}")
		
		.header("x-api-key", "PMAK-64ca3309e902bd0043353979-1eedca86d7d9f4275f3f4b9d91503f34eb")
		
		.when()
		
		.post("/workspaces")
		
		.then()
		
		.extract()
		
		.response();
		
		
	String stringresponse=	response.asPrettyString();
	
	System.out.println(stringresponse);
		
	}


}
