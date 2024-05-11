package com.exampleone;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Scanner;

import org.testng.Assert;

public class Demo1 
{
	public static void main(String np[])
	{
		
		RestAssured.baseURI =  "https://reqres.in";
		
		// given().when().then();
		
		
		
		// Example on Get Method
		// validate the status code is 200 or not
		given().queryParam("page","1")
		.when().get("api/users")
		.then().statusCode(200);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter User Idno :");
		int id_no = input.nextInt();
		
		// storing the response into a variable
		String response = given().
				when().get("api/users/"+id_no).
				then().statusCode(200).
				extract().response().asString();
		
		
		// Converting the string into Json
		JsonPath jp = new JsonPath(response);
		int response_idno = jp.getInt("data.id");
		
//		if(id_no == response_idno)
//		{
//			System.out.println("Both are same");
//		}
		
		Assert.assertEquals(response_idno, id_no);
	}
}
