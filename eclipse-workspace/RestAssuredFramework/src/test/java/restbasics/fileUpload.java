package restbasics;

import org.testng.annotations.Test;
import java.io.File;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class fileUpload {

	
@Test()
	public void uploadfile() {
		
		 File Image = new File("D:\\1 Automation\\RestAssured\\image.jpg");
		 System.out.println(Image);
		
			RestAssured.baseURI="https://the-internet.herokuapp.com";
			given()
		   
		   .multiPart("file",Image)
		   .log()
		   .all()
		   .when()
		   .post("/upload")
				   .then()
					.log().all();
	
		   
		
	}
}

