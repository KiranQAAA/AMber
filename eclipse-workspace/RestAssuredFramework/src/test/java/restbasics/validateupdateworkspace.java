package restbasics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class validateupdateworkspace {
	@Test
	public void updateWorkspace()
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		
		Response response = given()
		
		.body("{\r\n"
				+ "    \"workspace\": {\r\n"
				+ "        \"name\": \"NEW RestAssured Workspace\",\r\n"
				+ "        \"type\": \"personal\",\r\n"
				+ "        \"description\": \"UpdatedThis workspace created using RestAssured code \"\r\n"
				+ "    }\r\n"
				+ "}")
		
		.header("x-api-key", "PMAK-64ca3309e902bd0043353979-1eedca86d7d9f4275f3f4b9d91503f34eb")
		
		.when()
		
		.put("/workspaces/696a2f9b-00a5-45ec-9c3a-c97ed7fb0d3b")
		
		.then()
		
		.extract()
		
		.response();
		
		
	String stringresponse=	response.asPrettyString();
	
	System.out.println(stringresponse);
		
	}

}
