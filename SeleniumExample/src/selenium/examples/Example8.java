package selenium.examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example8 
{
	static WebDriver driver;
	
	public static void validate(String error_message,String message)
	{
		if(error_message.equals(message))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	// Test - 1
	public static void loginWithEmptyFileds()
	{
		driver.findElement(By.cssSelector("input[id$='loginNow']")).click();
		
		String error_message = "The Email / Username field is required.";
		
		String message = driver.findElement(By.id("userNameValidationMessage")).getText();
		
		validate(error_message,message);
	}
	// Test - 2
	public static void loginWithEmailandWithoutPassword()
	{
		String error_message = "The Password field is required.";
		
		driver.findElement(By.id("UserName")).sendKeys(MyApplicationConstants.USERNAME_EMAIL);
		
		driver.findElement(By.cssSelector("input[id$='loginNow']")).click();
		
		String message = driver.findElement(By.id("passwordValidationMessage")).getText();
		
		validate(error_message,message);
	}
	// Test - 3
	public static void loginWithPasswordWithoutEmail()
	{
		String error_message = "The Email / Username field is required.";
		
		driver.findElement(By.id("UserName")).clear();
		
		driver.findElement(By.id("Password")).sendKeys(MyApplicationConstants.USER_PASSWORD);
		
		driver.findElement(By.cssSelector("input[id$='loginNow']")).click();
		
		String message = driver.findElement(By.id("userNameValidationMessage")).getText();
		
		validate(error_message,message);
		
	}
	// Test - 7
	public static void loginWithValidUsernamePassword()
	{
		driver.findElement(By.id("UserName")).clear();
		driver.findElement(By.id("UserName")).sendKeys(MyApplicationConstants.USERNAME_EMAIL);
		
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(MyApplicationConstants.USER_PASSWORD);
		
		driver.findElement(By.cssSelector("input[id$='loginNow']")).click();
		
		try
		{
			driver.findElement(By.id("userLogOut"));
			System.out.println("Valid user");
		}
		catch (Exception e)
		{
			System.out.println("Invalid user");
		}
	}

	
	public static void main(String[] args) 
	{
		
		driver = new FexQuizBasicOperations().openBrowser();
		
		driver.findElement(By.cssSelector("a.btn.btn-sm.btn-link")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		
		// Test - 1
		// Login with empty fields
		loginWithEmptyFileds();
		
		
		// Test - 2
		// Login with email and without password
		loginWithEmailandWithoutPassword();
		
		// Test - 3
		// Login with password and without email
		loginWithPasswordWithoutEmail();
		
		// Test - 4
		// Login with wrong email and password
		
		
		// Test - 5
		// Login with right email and wrong password
		
		
		// Test - 6
		// Login with wrong email and right password
		
		
		// Test - 7
		// Login with valid username and password 
		loginWithValidUsernamePassword();
		
	}

}


