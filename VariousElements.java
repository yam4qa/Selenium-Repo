package packA;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousElements 
{
	@Test
	public void exploreVariousElements() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://objectspy.space/");
		Thread.sleep(2000);
		
		//Elements - click on Radio Button Male- by Id, input box- by name, link-text, partial link-text
		driver.findElement(By.id("sex-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("John Dev");
		Thread.sleep(1000);
//		driver.findElement(By.linkText("Link Test : New Page")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Link Test : Page")).click();
//		Thread.sleep(3000);
		// Element- using partialLinkText for href text
		driver.findElement(By.partialLinkText("OS-API ")).click();

		Thread.sleep(3000);		
		driver.close();
		driver.quit();
	}
}
