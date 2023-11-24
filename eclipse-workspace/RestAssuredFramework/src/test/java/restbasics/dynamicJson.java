package restbasics;

import org.testng.annotations.Test;

import Files.payload;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class dynamicJson {

	@Test
	public void Add_Book() {
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		String responce =given().header("Content-Type","application/json")
		.body(payload.Addbook()).when().post("Library/GetBook.php?ID=bcd2926").then()
		.log().all().extract().response().asString();
		
		JsonPath js= new JsonPath(responce);
	//	int id =js.getInt("ID");
	//	System.out.println(id);
		
	}
}
