package selenium.examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Example3 {

	public static void main(String[] args) 
	{
		// WevDriver is a interface
		// ChromeDriver is a class
		
		// ChromeDriver class is implementing WebDriver Interface 
		
		String url = "https://www.flexiquiz.com/home/features";
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver = new EdgeDriver();
		driver.get(url);
		String pagetitle = driver.getTitle();
		
	}

}


// Notes
//======
// Interface is a collection of variables and unimplemented methods
// ChromeDriver class is implementing WebDriver Interface
// If a class is implementing an interface it means -- the class is implementing the unimplemented methods