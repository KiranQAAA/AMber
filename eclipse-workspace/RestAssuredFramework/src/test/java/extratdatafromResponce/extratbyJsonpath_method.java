package extratdatafromResponce;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class extratbyJsonpath_method {
	@Test

	public void updateWorkspace()
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		
		Response response = given()
		
		.body("{\r\n"
				+ "    \"workspace\": {\r\n"
				+ "        \"name\": \"NEW RestAssured Workspace\",\r\n"
				+ "        \"type\": \"personal\",\r\n"
				+ "        \"description\": \"Updated This workspace created using RestAssured code \"\r\n"
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
		
	
	JsonPath js = response.jsonPath();
	
	String idvalue = js.getString("workspace.id");  //here workspace is parent and Id and Name Child so that we write workspace.id for getting Id 
	
	System.out.println("Updated workspace id is :"+idvalue);
	
	String Name = js.getString("workspace.name"); 
	System.out.println("Updated workspace name is :"+Name);		//here workspace is parent and Id and Name Child so that we write workspace.name for getting name 
	}


}
