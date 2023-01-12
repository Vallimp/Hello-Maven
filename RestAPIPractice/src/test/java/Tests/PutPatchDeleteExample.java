package Tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

//import static io.restassured.RestAssured.baseURI;
//import static io.restassured.RestAssured.given;

public class PutPatchDeleteExample {
@Test
	public void PutTest() {
	//put is nothing but update
		JSONObject request = new JSONObject();
		request.put("name", "Valli");
		request.put("job","Teacher");
		System.out.println(request.toJSONString()); 
			//body is created
		
		baseURI = "https://reqres.in/api";
		given().
		contentType(ContentType.JSON).  
		accept(ContentType.JSON).     
			body(request.toJSONString()).
		when().
			put("/users/2"). 
		then().
			statusCode(200).
			log().all(); 
}

@Test
public void PatchTest() {
	//patch is nothing but update
		JSONObject request = new JSONObject();
		request.put("name", "Valli");
		request.put("job","Teacher");
		System.out.println(request.toJSONString()); 
			//body is created
		
		baseURI = "https://reqres.in";
		given().
		contentType(ContentType.JSON).  
		accept(ContentType.JSON).     
			body(request.toJSONString()).
		when().
			patch("api/users/2"). 
		then().
			statusCode(200).
			log().all(); 
}
@Test
public void DeleteTest() {
		baseURI = "https://reqres.in";
		given().
		when().
			delete("api/users/2"). 
		then().
			statusCode(204).
			log().all(); 
}
}
