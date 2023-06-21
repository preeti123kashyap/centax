package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.FacebookLoginPage;

import testBase.BaseClass;

public class FacebookLoginTest extends BaseClass {
	@Test
	void facebookLogintest() throws Throwable
	{
	try {
		sleep(3000);
		logger.info("Login test started");
		FacebookLoginPage fp = new FacebookLoginPage(driver);
		sleep(3000);
		fp.FacebookLogin();
	//sleep(3000);
		switchNew(driver);
	logger.info("Clicked");
	//gp.AnotherAccount();
	fp.FacebookEmail(rb.getString("FacebookEmail"));

	fp.FacebookPass(rb.getString("FacebookPass"));
	fp.LoginBtn();
	fp.LogoutDropdown();
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.centaxonline.com/latest-news-updates/all");
	}catch(Exception e)
	{
		logger.error("Test failed");
		Assert.fail();
		
	}
	}

}
