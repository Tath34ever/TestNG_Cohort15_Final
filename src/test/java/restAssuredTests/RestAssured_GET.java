package restAssuredTests;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_GET {

	public static void main(String[] args) {
		
		
		// set the base URL
		RestAssured.baseURI = "https://api.restful-api.dev/objects";
		
		//create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//response object
		Response myResponse = httpRequest.request(Method.GET);
		
		
		System.out.println("Here is my status code ==> " + myResponse.getStatusCode());
		
//		System.out.println("This is my Response Message: " + myResponse.then().log().all());
		
		System.out.println(myResponse.prettyPrint());
		
		
		Assert.assertEquals(myResponse.getStatusCode(), 403);
	}
}
