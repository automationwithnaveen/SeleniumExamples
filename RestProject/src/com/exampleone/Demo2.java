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
		String endpoint = "api/users";
		int page_number = 1;
		int actual_total = 0;
		int count_total = 0;
		
		while(true)
		{
			String response = given().queryParam("page", ""+page_number).
					when().get(endpoint).
					then().log().all().statusCode(200).
					extract().response().asString();
			
			JsonPath jp = new JsonPath(response);
			
			if(page_number == 1)
			{
				actual_total = jp.getInt("total");
			}
			
		    int count = jp.getInt("data.size()");
		    
		    if(count == 0)
		    {
		    	break;
		    }
		    
		    count_total += count;
		    
		    page_number++;
			
		}
		
		Assert.assertEquals(actual_total, count_total);
	}
}
