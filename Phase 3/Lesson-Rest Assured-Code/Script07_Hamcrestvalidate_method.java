package restassuredScripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

public class Script07_Hamcrestvalidate_method {
	
	// Hamcrest dependency ahs been added to your POM file
		// This depenedency provides us many validation methods that help us to validate the response code

		// equalTo() Hamcrest method
		@Test(priority='1')
		public void ValidateRepsonseBody()
		{
			String PMapikey = "PMAK-654c62c0723911002ade55f4-baf94cf2884f94912e8d7285a6703d027b";
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("X-API-Key", PMapikey)
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("workspaces[4].id", equalTo("d90967d3-ba05-4cd6-89f2-d49dc6596ae9"),
				  "workspaces[4].name",equalTo("myworkspace new demo"),
				   "workspaces[4].type",equalTo("personal"));
			
			
		}
		
		@Test(priority='2')
		public void ValidateRepsonseBody_equalTo()
		{
			
			given().baseUri("https://petstore.swagger.io")
			.basePath("/v2/user/Uname001")
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("username", equalTo("Uname001"),
				  "email", equalTo("Positive@Attitude.com"),
				  "userStatus", equalTo(1));
			
			
		}
		
		
		@Test(priority='3')
		public void ValidateRepsonseBody_hasitems()
		{
			String PMapikey = "PMAK-654c62c0723911002ade55f4-baf94cf2884f94912e8d7285a6703d027b";
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("X-API-Key", PMapikey)
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("workspaces.name", hasItems("Team Workspace","Phase3-Trainer","My Workspace"),
					"workspaces.type", hasItems("team","personal"));
			
			
		}

}
