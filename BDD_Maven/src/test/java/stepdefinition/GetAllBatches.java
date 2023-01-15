package stepdefinition;

import io.restassured.RestAssured;
import io.cucumber.core.cli.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;

import org.junit.Assert;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.cucumber.core.runtime.Runtime runFeatures


//RequestSpecification req;
//RequestSpecification res;
Response response;

public class GetAllBatches {
	
	@Given("A Service URL with URI path")
	public void a_service_url_with()
	{
	RequestSpecification req = new RequestSpecBuilder().setBaseUri("http://lms-backend-service.herokuapp.com/lms/")
	.setContentType(ContentType.JSON).build();
	RequestSpecification res = RestAssured.given().spec(req).log().all();

	}
	@When("GET request is made")
	public void GET_request_is_made()
	{
	 response =  given().when().get("http://lms-backend-service.herokuapp.com/lms/batches").
		      then().log().all();
	}
	
	@Then("Validate response status code")
	public void validate_response_status_code()
	{
	    System.out.println("The response code - " +response.getStatusCode());
	    Assert.assertEquals(response.getStatusCode(),200);
}
