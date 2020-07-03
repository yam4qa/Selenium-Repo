package packA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathAxis 
{
	public void loginAndNext() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=login/");
		
		driver.findElement(By.xpath("//input[contains(@class,'form-control') and @name='username'] ")).sendKeys("techfiosdemo@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("abc123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@class,'btn-success')]")).click();
		Thread.sleep(1000);
				
		//practicing X-path Axis --> xpath //Relationship :: tag or another full-xpath
		String dashboardTitleXpath = "//div[@id='page-wrapper'] //descendant :: h2[contains(text() , 'Dashboar')]";	
		
		//explicit-wait
		WebDriverWait wait = new WebDriverWait(driver , 10);//we created wait
		// here we are defining the condition for that 'wait' to be waiting and then lasts
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dashboardTitleXpath)));
		// or you can write like below. but somehow it doesn't work.
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(dashboardTitleXpath))));
		
		driver.close();
		driver.quit();		
	}

}
