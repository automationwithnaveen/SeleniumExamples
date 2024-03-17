package selenium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlexiQuizLoginTests 
{
	static WebDriver driver;
	
	public static void loginWithEmptyFileds()
	{
		driver.findElement(By.cssSelector("input[id$='loginNow']")).click();
		
		String error_message = "The Email / Username field is required.";
		
		String message = driver.findElement(By.id("userNameValidationMessage")).getText();
		
		//if(error_message == message)
		if(error_message.equals(message))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
