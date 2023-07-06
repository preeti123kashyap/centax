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
			sleep(3000,driver);
			logger.info("Facebook Login test started");
			FacebookLoginPage fp = new FacebookLoginPage(driver);
			sleep(3000,driver);
			fp.FacebookLogin();

			switchNew(driver);


			fp.FacebookEmail(rb.getString("FacebookEmail"));

			fp.FacebookPass(rb.getString("FacebookPass"));
			fp.LoginBtn();

			switchOld(driver);

			sleep(7000,driver);

			try {
				String url = driver.getCurrentUrl();
				if (url.equals("https://www.centaxonline.com/latest-news-updates/all")) {
					logger.info("Successfully logged-in");}
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Un-successfully logged-in");
			}


			sleep(3000,driver);
			fp.LogoutDropdown();
		}catch(Exception e)
		{
			logger.error("Facebook Login failed");
			//Assert.fail();

		}

	}

}
