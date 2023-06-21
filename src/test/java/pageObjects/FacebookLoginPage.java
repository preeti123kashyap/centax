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
	
	@FindBy(xpath="//i[@class='x1b0d499 xi3auck']")
	WebElement LogoutDropdown;
	
			@FindBy(xpath="(//div[@class='x1oo3vh0 x1rdy4ex']//div//div//div)[1]")
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
