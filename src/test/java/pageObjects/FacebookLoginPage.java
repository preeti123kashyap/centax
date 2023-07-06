package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPage extends BasePage {
	public  FacebookLoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	// Elements
	@FindBy(xpath = "//a[normalize-space()='Sign in with Facebook']")
	WebElement FacebookLogin;
	
	@FindBy(css ="#email")
	WebElement FacebookEmail;
	
	@FindBy(css ="#pass")
	WebElement pass;
	
	@FindBy(xpath ="//input[@name='login']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//ul[@class='help-menu']//li[3]//a[@class='btn-ic']")
	WebElement LogoutDropdown;
	
			@FindBy(xpath="//a[normalize-space()='Logout']")
			WebElement LogoutBtn;
	
	
	public void FacebookLogin()
	{
		FacebookLogin.click();
	}
	
	
	public void FacebookEmail(String Facebookemail)
	{
		FacebookEmail.sendKeys(Facebookemail);
	}
	
	public void FacebookPass(String Facebookpass)
	{
		pass.sendKeys(Facebookpass);
	}
	
	public void LoginBtn()
	{
		LoginBtn.click();
	}
	
	public void LogoutDropdown()
	{
		LogoutDropdown.click();
		LogoutBtn.click();
	}
}
