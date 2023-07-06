package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public  RegistrationPage (WebDriver driver)
	{
		super(driver);
		
	}
	
	//Elements
	@FindBy(xpath="//a[contains(text(),'Create a new account')]")
    WebElement click_link;
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	WebElement first_n;
	
	@FindBy(xpath="//input[@formcontrolname='lastName']")
	WebElement last_n;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement email_reg;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	WebElement pwd_reg;
	
	@FindBy(xpath="//a[contains(text(),'Next')]")
	WebElement next;
	
	//Actions methods
	public void clickLink()
	{
		click_link.click();
	}
	
	
	public void setfirstn(String fname)
	{
		first_n.sendKeys(fname);
	}
	
	public void setlastn(String lname)
	{
		last_n.sendKeys(lname);
	}
	public void setemail(String email)
	{
		email_reg.sendKeys(email);
	}
	
	public void password(String pwd)
	{
		pwd_reg.sendKeys(pwd);
	}
	public void clicknext() {
		
        next.click();
	}
	
}
