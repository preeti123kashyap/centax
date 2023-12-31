package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class RegistrationTest extends BaseClass {
	@Test
	void testRegistration() throws Throwable {
	try {
		RegistrationPage rp = new RegistrationPage(driver);
		rp.clickLink();
		sleep(2000,driver);
		rp.setfirstn(randomString());
		rp.setlastn(randomString());
		rp.setemail(randomString() + "@gmail.com");
		rp.password(randomAlphaNumeric());
		sleep(4000,driver);
		scrolldown(300, driver);
	
		rp.clicknext();
		
		sleep(4000,driver);
		

		
		  String url=driver.getCurrentUrl(); 
		  System.out.println(url);
		  
		  Assert.assertEquals(url,"https://www.centaxonline.com/auth/mobileVerification"); 
		  sleep(2000,driver);
		  }catch(Exception e)
		  { 
			  Assert.fail();
		  
		  }
		 
	}}
