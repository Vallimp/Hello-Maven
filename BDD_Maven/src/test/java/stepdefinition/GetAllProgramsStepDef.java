package stepdefinition;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class GetAllProgramsStepDef {
    private static final String BASE_URL = "http://lms-backend-service.herokuapp.com/lms/";
    private static Response saveProgramResp;
    private static String jsonString;
    private static String requestPath;
    private static int statusCode;
    RequestSpecification req;
    Response response;

    @Given("body specifications with a Service URL")
    public void body_specifications_with_a_service_url() {
        req = new RequestSpecBuilder().setBaseUri(BASE_URL)
                .setContentType(ContentType.JSON)
                .build()
                .log()
                .all();
        req = given().spec(req);
    }

    @When("GET request is made")
    public void get_request_is_made() {

        response= req.when().get("/allPrograms");
        response.body().print();
    }

    @Then("Validate status code for getting all programs")
    public void validate_status_code_for_getting_all_programs() {
        int actualCode = response.then().extract().statusCode();
        Assert.assertEquals(200, actualCode);
    }
}