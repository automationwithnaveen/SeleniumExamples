package com.exampleone;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

public class Demo2 
{
	public static void main(String np[])
	{
		RestAssured.baseURI = "https://reqres.in";
		
		
		String response = given().queryParam("page", "1").
		when().get("api/users").
		then().statusCode(200).
		extract().response().asString();
		
		
		JsonPath jp = new JsonPath(response);
		
		int total = jp.getInt("total"); // 12
		int per_page = jp.getInt("per_page"); //6
		
		System.out.println(per_page);
		

		
		
	}
}
