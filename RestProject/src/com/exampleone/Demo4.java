package com.exampleone;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo4 {

	public static void main(String[] args)
	{
		
		RestAssured.baseURI = "https://reqres.in";
		String endpoint = "api/users";
		
		
		String response = given().body("{\n"
				+ "    \"name\": \"Naveen Kumar\",\n"
				+ "    \"job\": \"Faculty\"\n"
				+ "}").
		when().post(endpoint).
		then().statusCode(201).
		extract().response().asString();
		
		JsonPath jp = new JsonPath(response);
		
		String id = jp.get("id");
		String date = jp.get("createdAt");
		
		System.out.println("Employee Id "+id);
		System.out.println("Created At "+date);
	}

}
