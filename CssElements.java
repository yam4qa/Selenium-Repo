package packA;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssElements 
{
	@Test
	public void exploreCssElements() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.get("http://objectspy.space/");
		Thread.sleep(2000);
		
		
		//tagname#ID
		driver.findElement(By.cssSelector("input#sex-0")).click();
		Thread.sleep(1000);
		//tagname.class
		driver.findElement(By.cssSelector("input.inputs")).sendKeys("Yamini");
		Thread.sleep(1000);
		//tagname[attribute='value']
		driver.findElement(By.cssSelector("input[value='Female']")).click();
		Thread.sleep(1000);
		//tagname.class[attribute='value']
		driver.findElement(By.cssSelector("label.checkbox[for='profession-1']")).click();
		driver.findElement(By.cssSelector("select.input-xlarge[name='continents']")).click();
		Thread.sleep(1000);
		//multiple attributes
		driver.findElement(By.cssSelector("input[name='lastname'][type='text']")).sendKeys("Appa"); //attributes are name="lastname" type="text" 
		
		//tagname[atrribute*=('partial or fulltext')] - * represents contains
//		driver.findElement(By.cssSelector("input[value*='keywords']")).sendKeys("krish"); //attribute is value="Enter keywords....."
//		driver.findElement(By.cssSelector("input[name*='field']")).sendKeys("krish"); //attribute is name="search_field"
		//tagname[atrribute^=('partial or full text')] - ^ represents starts-with
//		driver.findElement(By.cssSelector("input[name^='search']")).sendKeys("Krish"); //attribute is name="search_field"
		//tagname[atrribute$=('partial or full text')] - $ represents Ends-with
		driver.findElement(By.cssSelector("input[name$='field']")).sendKeys("Krish"); //attribute is name="search_field"
		
		
		Thread.sleep(5000);		
		driver.close();
		driver.quit();
	}

}
