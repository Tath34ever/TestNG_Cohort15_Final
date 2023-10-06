package restAssuredTests;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class RestAssured_listAndVerifyBoardInformation {

	public static void main(String[] args) {
		
		RestAssured.given().param("key", "4b1afc51b1339e09213f9bd25c8932cd")
		.param("token" ,"ATTAca2c82af3bd63a9dcf367312a81ab8b952e6fe3763fa55ae8179ea358d98915c27265774" )
		.get("https://api.trello.com/1/members/me/boards").then()
		.statusCode(200)
		.body("id[0]", equalTo("6514bcc64b65f5deec284698")).body("name", hasItems("CreateABoardTemplate", "LoneWolf"));
		
		System.out.println("PASS");
		
		
		
		
	}
}
