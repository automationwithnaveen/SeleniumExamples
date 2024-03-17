package selenium.examples;

import org.openqa.selenium.By;

public class Example9 extends Example8
{
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
	
	public static void loginWithEmailandWithoutPassword(int a)
	{
		
	}
}
