package restassuredScripts;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Script03_PostMethod {
	
	@Test
	public void postmethod()
	{
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "Dikshansh");
		map.put("job", "Tester");
		
		RestAssured.
		given()
		.baseUri("https://reqres.in/")  //url
		.basePath("/api/user")          // request
		.contentType("application/json")  //what type of content body we are sending-JSON
		.body(map)  //this is the body to be sent with post request
		.when().post()
		.then().statusCode(201).log().all();
		
	}

}
