package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	public  LoginPage(WebDriver driver)
	{
		super(driver);
		
	}

	// Elements
				@FindBy(name = "Email")
				WebElement Email;
				
				@FindBy(name ="Password")
				WebElement Password;
				
				@FindBy(xpath = "//a[contains(text(),'Sign In')]")
				WebElement submit;
				
				
				//Actions methods
				public void setEmail(String fname) {
					Email.sendKeys(fname);

				}
				
				public void setpwd(String pwd) {
					Password.sendKeys(pwd);
	                    
				}
				public void clicksubmit() {
					
	                submit.click();
				}
	
}


