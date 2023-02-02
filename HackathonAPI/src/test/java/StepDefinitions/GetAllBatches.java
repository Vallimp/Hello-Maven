package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllBatches
{
RequestSpecification req;
RequestSpecification res;
Response response;
//RestAssured.baseURI = "http://lms-backend-service.herokuapp.com/lms";

@Given("A Service URL")
public void a_service_url()
{
RestAssured.baseURI = "http://lms-backend-service.herokuapp.com/lms/";
//RestAssured.given().get("/batches"). then().
//statusCode(200);
}
@When("Get request is made")
public void get_request_is_made()
{
response = RestAssured.given().get("/batches");
}

@Then("Validate response status code received")
public void validate_response_status_code_received()
{
System.out.println("Our Status code :"+ response.getStatusCode());  
}
}
