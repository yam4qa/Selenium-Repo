package packA;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser 
{
	@Test
	public void openGoogleSite() throws InterruptedException
	{
		//Set Property for Chrome Driver to be default driver //System.setProperty("<driver-name>", <driver-location>");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//Instantiate the ChromeDriver object , ChromeDriver is an interface
		WebDriver chrDriver = new ChromeDriver();
		
		//Implicit Wait
		chrDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Delete Cookies and history
		chrDriver.manage().deleteAllCookies();
		//Maximize Browser
		chrDriver.manage().window().maximize();
				
		// open google page automatically
		chrDriver.get("https://www.google.com");
		
		
		//Slow Down Java 1000 ms = 1 sec
		Thread.sleep(3000);
		chrDriver.close();
		chrDriver.quit();
	}

}
