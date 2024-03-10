package selenium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example7 extends FexQuizBasicOperations
{
	WebDriver driver;
	
	public Example7()
	{
		driver = openBrowser();
	}
	
	public void signUp() throws InterruptedException
	{
		//WebDriver driver = openBrowser();
		driver.findElement(By.id("fq-main-menu-access")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
	}
	
	public void loginCheck()
	{
		//WebDriver driver = openBrowser();
		driver.findElement(By.id("fq-main-menu-auth")).click();
		
	}
	
	public void products()
	{
		//WebDriver driver = openBrowser();
		driver.findElement(By.xpath("//*[@id=\"fq-main-menu-item-product\"]/a"));
	}
	
	public void pricing()
	{
		//WebDriver driver = openBrowser();
		driver.findElement(By.xpath("//*[@id=\"fqo-main-menu-item-pricing\"]/a"));
	}
	
}
