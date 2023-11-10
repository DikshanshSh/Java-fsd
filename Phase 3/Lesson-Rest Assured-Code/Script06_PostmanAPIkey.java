package restassuredScripts;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Script06_PostmanAPIkey {
	
	@Test(priority='1')
	public void postmangetreq()
	{
		String PMapikey = "PMAK-654c62c0723911002ade55f4-baf94cf2884f94912e8d7285a6703d027b";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200).log().all();
		
		
	}
	
	
	@Test(priority='2')
	public void extract_value_response()
	{
		String PMapikey = "PMAK-654c62c0723911002ade55f4-baf94cf2884f94912e8d7285a6703d027b";
		
		String responseoutput = given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then()
		.extract().path("workspaces[1].name"); // extracting the name and save it in a string
		
		System.out.println("The name of the workspace extracted is: " + responseoutput);
		
	}
	
	
	

	@Test(priority='3')
	public void extract_response_JSONPath()
	{
		String PMapikey = "PMAK-654c62c0723911002ade55f4-baf94cf2884f94912e8d7285a6703d027b";
		
		Response res = given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then()
		.extract().response(); // extracting the response and save it in a Response object
		
		JsonPath json = new JsonPath(res.asString());
		
		System.out.println(json.getString("workspaces[4]"));
		

}
}
