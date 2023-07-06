package testBase;

import java.time.Duration;
import java.util.Arrays;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass extends GenericFunctions{
	public WebDriver driver;
	public  Logger logger;
	public ResourceBundle rb;
@BeforeClass
@Parameters("browser")
public void setup(String br)
{
	
	rb=ResourceBundle.getBundle("config");
	logger= LogManager.getLogger(this.getClass());
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--incognito","--start-maximized");
	options.addArguments(Arrays.asList("--incognito","--start-maximized"));
//	options.addArguments("user-data-dir=C:/Users/user_name/AppData/Local/Google/Chrome/User Data");
	//options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
	options.addArguments("--remote-allow-origins=*");
	
	if(br.equals("chrome"))
	{
	driver= new ChromeDriver(options);
	}
	else if(br.equals("edge"))
	{
		driver= new EdgeDriver();
		
	}
	else
	{
		driver= new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(rb.getString("appUrl"));
	
	driver.manage().window().maximize();

}
@AfterClass
public void teardown()
{
	
driver.quit();	
}

}