package selenium.examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example8 {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new FexQuizBasicOperations().openBrowser();
		
		driver.findElement(By.cssSelector("a.btn.btn-sm.btn-link")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		
		// Test - 1
		// Login with empty fields
		
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


