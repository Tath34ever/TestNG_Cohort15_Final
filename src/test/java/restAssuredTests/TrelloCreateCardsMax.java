package restAssuredTests;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TrelloCreateCardsMax {

	public static void main(String[] args) {

		String key = "4b1afc51b1339e09213f9bd25c8932cd";
		String token = "ATTAca2c82af3bd63a9dcf367312a81ab8b952e6fe3763fa55ae8179ea358d98915c27265774";
		String listID = "6514d365ce3cb72180995a95";
		int numLists = 0;

		// Rest assured base url

		RestAssured.baseURI = "https://api.trello.com/1/cards";

		// create request object
		RequestSpecification httpRequest = RestAssured.given();

		// json is a format - java script object notation

		httpRequest.header("Content-Type", "application/json");

		int maxCards = 1001;
		int numCards = 0;

		while (numCards < maxCards) {
			JSONObject requestBody = new JSONObject();

			requestBody.put("name", "Cards for LoneWolf - " + (numLists + 1));
			requestBody.put("idList", listID);
			requestBody.put("key", key);
			requestBody.put("token", token);

			Response myResponse = httpRequest.body(requestBody.toJSONString()).post();

			int statusCode = myResponse.getStatusCode();
			if (statusCode == 200) {
				numCards++;
				System.out.println("Cards" + numCards + " created");
			} else {
				System.out.println("Failed to create card");
				myResponse.prettyPrint();
				break;

			}

		}

		System.out.println("Number of cards created: " + numCards);

	}

}
