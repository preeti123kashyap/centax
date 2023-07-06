package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleLoginPage extends BasePage{
	public  GoogleLoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	// Elements
	@FindBy(xpath = "//asl-google-signin-button[@type='standard']")
	WebElement GmailLogin;
	
	@FindBy(xpath ="//div[contains(text(),'Use another account')]")
	WebElement AnotherAccount;
	
	@FindBy(id ="identifierId")
	WebElement id;
	
	@FindBy(xpath ="//span[contains(text(),'Next')]")
	WebElement NextBtn;
	
	@FindBy(name ="password")
	WebElement GooglePassword;
	
	
	public void GmailLogin1()
	{
		GmailLogin.click();
	}
	
	public void AnotherAccount()
	{
		AnotherAccount.click();
	}
	
	public void id(String GoogleId)
	{
		id.sendKeys(GoogleId);
	}
	
	public void NextBtn()
	{
		NextBtn.click();
	}
	
	public void GooglePassword(String GooglePassword1)
	{
		GooglePassword.sendKeys(GooglePassword1);
	}
}