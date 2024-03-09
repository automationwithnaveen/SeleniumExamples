package selenium.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FexQuizBasicOperations 
{
	public WebDriver openBrowser()
	{
		WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.flexiquiz.com/");
        
        return driver;
	}
}
