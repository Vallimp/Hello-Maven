package StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import static org.junit.Assert.*;

import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class DeleteProgramyName {
	
	RequestSpecification req;
	RequestSpecification res;
	 Response response;
	 
	@Given("A Service with URL to Delete Program By Name")
	public void a_service_with_url_to_delete_program_by_name() {
		req =new RequestSpecBuilder().setBaseUri("https://lms-backend-service.herokuapp.com/lms/")
				.setContentType(ContentType.JSON).build();
		  res=given().spec(req); 
		
	}

	@When("DELETE request is made for Program by passing Program Name as a parameter")
	public void delete_request_is_made_for_program_by_passing_program_name_as_a_parameter() {
	     response=res.when().delete("/deletebyprogname/restassuredteam4").then().extract().response();

	}

	@Then("the API call is successful for program deletion with status code {int}")
	public void the_api_call_is_successful_for_program_deletion_with_status_code(Integer int1) {
		
		Assert.assertEquals(response.getStatusCode(), 200);

	}

	@Then("the API call results in a bad status code")
	public void the_api_call_results_in_a_bad_status_code() {
	    
		response.then().log().all().assertThat().statusCode(400).body("errorCode",
				Matchers.equalTo("ENTITY_DOES_NOT_EXIST"));
	}


}
