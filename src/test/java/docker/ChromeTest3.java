package docker;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeTest3 
{
	@Test
	public void test3() throws MalformedURLException
	{

    //For Chrome	
  
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("demo_capability", true);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.merge(capabilities);  //this will merge the capabilities to the ChromeOptions
		
		
		
		
	
		URL url = new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,options);
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("Title of the page : " +driver.getTitle());
		
		driver.close();
		
	}

}
