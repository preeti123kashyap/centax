package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass {
	@Test
	void testlogin()
	{
	try {
		logger.info("Facebook Login test started");
	LoginPage lp = new LoginPage(driver);
	lp.setEmail(rb.getString("email"));
	lp.setpwd(rb.getString("pwd"));
	lp.clicksubmit();
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.centaxonline.com/latest-news-updates/all");
	}catch(Exception e)
	{
		logger.error("Test failed");
		Assert.fail();
		
	}
	}
}
