package packA;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathElements 
{
	@Test
	public void loginTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		driver.get("http://techfios.com/test/billing/?ng=login/");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//*[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
		//driver.findElement(By.xpath("//input[contains(@class,'form-control') and @name='username'] ")).sendKeys("techfiosdemo@gmail.com");
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		//driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("abc123");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.xpath("//button[contains(@class,'btn-success')]")).click();
		//driver.findElement(By.cssSelector("button[type='submit']")).click(); //cssSelector tag[attribute='value']
		//driver.findElement(By.xpath("//*[text()='Sign in' and @name='login']")).click(); // xpath text()
		driver.findElement(By.xpath("//*[contains(text() , 'Sign') or @name='login']")).click(); // using contains and text both
		Thread.sleep(1000);
		
		
		
		driver.close();
		driver.quit();
	}

}
