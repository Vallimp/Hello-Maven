package stepdefinition;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

import java.net.URI;

import dev.failsafe.internal.util.Assert;


public class SaveBatchStepDef {

    private static final String BASE_URL = "http://lms-backend-service.herokuapp.com/lms/";
   
    String BatchDetails = "{\"batchName\": \"InterfaceStrike-2023042038785\", \"batchDescription\": \"Python\",\"batchStatus\": \"Active\",\"batchNoOfClasses\": 12,\"programId\": 1455,\"programName\": \"Program-2023042038960\"}";

@Given("A Service with URL \\(Save Batch)")
public void a_service_with_url_save_batch() {

         RestAssured.baseURI = BASE_URL;
}

@When("{string} are created with reference to programId")
public void are_created_with_reference_to_program_id(String string) {

	Response Postresponse = given().auth().none()
			.header("Content-type", "application/json")
			.contentType(ContentType.JSON)
			.when()
			.body(BatchDetails)
			.post("http://lms-backend-service.herokuapp.com/lms/batches");
			System.out.println("Post Response is"+Postresponse.asString());
			System.out.println("Post Response status code is"+Postresponse.statusCode());
			
throw new io.cucumber.java.PendingException();
}

@When("{string} request is made")
public void request_is_made(String string) {
       
   throw new io.cucumber.java.PendingException();
}

@Then("Save {string}")
public void save(String string) {
   // Write code here that turns the phrase above into concrete actions
   throw new io.cucumber.java.PendingException();
}

@Then("Validate status code")
public void validate_status_code() {
	
    throw new io.cucumber.java.PendingException();
}

@Then("Validate {string}")
public void validate(String string) {
   // Write code here that turns the phrase above into concrete actions
   throw new io.cucumber.java.PendingException();
}

@Given("A Service with {string} \\(batch by Id)")
public void a_service_with_batch_by_id(String string) {
   // Write code here that turns the phrase above into concrete actions
   throw new io.cucumber.java.PendingException();
}


}
