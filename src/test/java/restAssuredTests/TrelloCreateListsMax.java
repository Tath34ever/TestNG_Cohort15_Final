package restAssuredTests;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TrelloCreateListsMax {

	public static void main(String[] args) {
		
		String key = "4b1afc51b1339e09213f9bd25c8932cd";
		String token = "ATTAca2c82af3bd63a9dcf367312a81ab8b952e6fe3763fa55ae8179ea358d98915c27265774";
		String boardId = "651386397d056104984942cf";
		int numLists = 0;

		
		//Rest assured base url
		
		RestAssured.baseURI = "https://api.trello.com/1/lists";
		
		//create request object
		RequestSpecification httpRequest = RestAssured.given();
		
												//json is a format - java script object notation
		
		httpRequest.header("Content-Type", "application/json");
		
		
		//create lists until the maximun limit is reached
		
		while(true) {
			JSONObject requestBody = new JSONObject();
			
			requestBody.put("name", "LoneWolf" + (numLists + 1)); 
			requestBody.put("idBoard", boardId);
			requestBody.put("key", key);
			requestBody.put("token", token);
			
			Response myResponse = httpRequest.body(requestBody.toJSONString()).post();
			
			int statusCode = myResponse.getStatusCode();
			
			if(statusCode == 200) {
				numLists++;
				System.out.println("List " + numLists + " created.");
			}else{
				System.out.println("Failed to create list");
				myResponse.prettyPrint(); //print the response for the further inspection
				break; //this will stop creating lists if an error occurs	
			}
		}
		
		System.out.println("Number of lists created " + numLists);
		
		
	}
	
	
	
}
