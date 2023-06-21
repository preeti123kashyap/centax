package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.GoogleLoginPage;

import testBase.BaseClass;

public class GoogleLoginTest extends BaseClass{
	@Test
	void GoogleLogintest() throws Throwable
	{
	try {
		sleep(3000,driver);
		logger.info("Login test started");
		GoogleLoginPage gp = new GoogleLoginPage(driver);
		sleep(3000,driver);
		gp.GmailLogin1();
	//sleep(3000);
		switchNew(driver);
	logger.info("Clicked");
	//gp.AnotherAccount();
	gp.id(rb.getString("GoogleEmail"));
	//sleep(3000);
	gp.NextBtn();
//	sleep(3000);
	gp.GooglePassword(rb.getString("GooglePassword"));
	gp.NextBtn();
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.centaxonline.com/latest-news-updates/all");
	}catch(Exception e)
	{
		logger.error("Test failed");
		Assert.fail();
		
	}
	}
}


