package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
 public WebDriver driver;
 

 @BeforeClass
	public void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://demo-opencart.com/index.php?route=common/home&language=en-gb");
		driver.manage().window().maximize();
		Thread.sleep(3000);
				
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public String RandomStrings()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	
	public String RandomNumber()
	{
		String generatednumber = RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	
	public String RandomAlphaNumeric()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(3);
		String generatednumber = RandomStringUtils.randomNumeric(4);
		return (generatedstring +"new"+ generatednumber);
	}
}
