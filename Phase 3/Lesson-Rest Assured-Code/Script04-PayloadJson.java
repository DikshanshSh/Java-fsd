package restassuredScripts;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Script04_Payload_JSON {
	
	@Test
	public void postusingJSON()
	{
		
		JSONObject body = new JSONObject();
		body.put("name","abcde");
		body.put("salary", "12558");
		body.put("age" , "22");
		
		RestAssured.given()
		.baseUri("https://dummy.restapiexample.com/api/v1")
		.contentType(ContentType.JSON)
		.body(body.toString())
		.when().post("/create")
		.then()
		.statusCode(200)
		.log().all();
		
		
	}

}
