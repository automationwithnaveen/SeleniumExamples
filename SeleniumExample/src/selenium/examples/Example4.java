package selenium.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {

	public static void main(String[] args)
	{
		String url = "https://www.flexiquiz.com/home/features";
		
		// Download Chrome Drivers from Here : https://chromedriver.chromium.org/downloads
		
		System.setProperty("webdriver.chrome.driver", "/Users/Naveen/Desktop/Examples/chromedriver-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);

	}

}
