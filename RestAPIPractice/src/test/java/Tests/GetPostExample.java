package Tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; //for equalTo etc

public class GetPostExample {
	@Test
	public void GetTest() {
		//Get Test, 
		//1. initialise the api to baseURI
		//Import static all libraries in rest assured class by ending it with .*
		//Click on Get in reqres.in
		
		baseURI = "https://reqres.in/api";
		given().
			get("/users?page=2"). //specify the end point
		then().
			statusCode(200). //verify if status code is 200
			
		//google json path finder and copy the response in the example in reqres.in
		//click on beautify and for each index you find the json path for each item
		//copy the path of the item which you want to compare the actual and the expected result
		body("data[4].first_name", equalTo("George")). //To check whether the firstname at index 4 of the response is George
		body("data.first_name", hasItems("George","Rachel")); //Checking whether the firtnames has items like george and rachel
		//note tht index for data is not provided in the last line
		//Run this as Testng Test
		
	}
	@Test
	public void PostTest() {
		//post is for creating a new resource
	//click on post in reqres.in
	//Create te body using Map like how it is in the example
		//first method
	/*
	Map<String, Object> map = new HashMap<String, Object>(); //first one is key which is always a string and 
	//second is Value which can be anything so specify it as an object
	map.put("name", "Valli");
	map.put("job","Teacher");
	
	System.out.println(map);
	//but the output is not printed in json format inbetween the curly braces so we need to download some libraries
	//search json simple in maven central repository and copy the dependency in pom.xml
	
	//JSONObject request = new JSONObject(map); //import libraries fr json object
	*/
		
	JSONObject request = new JSONObject();
	request.put("name", "Valli");
	request.put("job","Teacher");
	System.out.println(request.toJSONString()); //we get output in json format
		//body is created
	
	baseURI = "https://reqres.in/api";
	given().
	//header("Content-Type","application/json").  //to know the header of the api
	contentType(ContentType.JSON). //telling tht we are sending json type 
	accept(ContentType.JSON).     //and accepts json type
		body(request.toJSONString()).
	when().
		post("/users"). //specify endponit check in reqres
	then().
		statusCode(201).
		log().all(); //to get all info 
	
	//google http status codes
	//100's information
	//200's success
	//300's redirection
	//400's client errors
	//500's server errors
	//also....
	//OK 200. The request was fulfilled.
	//CREATED 201. ...
	//Accepted 202. ...
	//Partial Information 203. ...
	//No Response 204. ...
	//Bad request 400. ...
	//Unauthorized 401. ...
	//PaymentRequired 402.
	
	}

}
