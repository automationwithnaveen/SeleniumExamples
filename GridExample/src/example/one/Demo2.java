package example.one;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo2 
{
	@Test
	public void openHomePage() throws MalformedURLException, URISyntaxException
	{
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setBrowserName("chrome");
		
		//dcap.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		
		
		//WebDriver driver  = new RemoteWebDriver(new URL("http://192.168.0.201:4444"),);
		// Mac
		WebDriver driver  = new RemoteWebDriver(new URI("http://192.168.0.201:4444").toURL(),dcap);
		
		
		driver.get("https://www.flexiquiz.com/");
		driver.close();
	}
}
