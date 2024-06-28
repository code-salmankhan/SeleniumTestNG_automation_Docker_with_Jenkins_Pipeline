package docker;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FireFoxTest 
{

	@Test
	public void test4() throws MalformedURLException
	{

    
		
	//For FireFox	
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("demo_capability", true);
		String webBrowserDriverPath="/usr/bin/geckodriver";
		System.setProperty("webdriver.gecko.driver", webBrowserDriverPath);
		final FirefoxOptions options = new FirefoxOptions();
		options.addArguments(
	            "--no-sandbox",
	            "--disable-extensions",
	            "--disable-gpu",
	            "--window-size=1920,1200",
	            "--ignore-certificate-errors",
	            "--whitelisted-ips=''",
	            "--disable-dev-shm-usage",
	            "--window-size=1920,1080",
	            "--lang=fr");
		
	
		options.addPreference("intl.accept_languages", "fr");
	
		
		//DesiredCapabilities dc= DesiredCapabilities.firefox();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,options);
		
		driver.get("https://www.amazon.com.au/");
		
		System.out.println("Title of the page : " +driver.getTitle());
		
		driver.close();
		
	}
}
