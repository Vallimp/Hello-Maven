package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.*; 
//import org.junit.jupiter.api.Assertions;
import org.junit.Assert;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateBatchusingPatch {
	Response response1;
	
	@Given("A Service URL with URI path is provided")
public void a_service_url_with_uri_path_is_provided() {
    RestAssured.baseURI = "https://lms-backend-service.herokuapp.com/lms/";

}

@When("Patch request is made as parameters at Path  {string}, {string}, are updated")
public void patch_request_is_made_as_parameters_at_path_and_are_updated(String batchName, String batchDescription) {

	String requestBody = ("{\"batchId\":\" "+batchId+"\",\"batchName\":\""+batchName+"\",\"batchDescription\": \" " +batchDescription+"\"}").when().patch(/batches/838);
	response1 = RestAssured.given()
            .header("Content-type", "application/json")
            .and()
            .body(requestBody)
            .when()
            .patch("/batches/838")
            .then()
            .extract().response();  
}

	@Then("Validate response status code at the end of the modification")
public void validate_response_status_code_at_the_end_of_the_modification() 
{
	System.out.println("The response code - " +response1.getStatusCode());
    Assert.assertEquals(response1.getStatusCode(),200);
}

/*@Then("Validate  {batchId}, {batchName} and {batchDescription} after the update action")
public void validate_and_after_the_update_action(String string, String string2, String string3) 
{
    Assertions.assertEquals("foo", response.jsonPath().getString("title"));
    Assertions.assertEquals("baz", response.jsonPath().getString("body"));
    Assertions.assertEquals("1", response.jsonPath().getString("userId"));
    Assertions.assertEquals("1", response.jsonPath().getString("id"));
}
	*/
	
	}
	
