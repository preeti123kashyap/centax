package testBase;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GenericFunctions {
	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}

	public String randomNumber() {
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return (generatedString2);
	}

	public String randomAlphaNumeric() {
		String st = RandomStringUtils.randomAlphabetic(4);
		String num = RandomStringUtils.randomNumeric(3);

		return (st + "@" + num);
	}

	public void sleep(int nenoSecond) throws Throwable {

		Thread.sleep(nenoSecond);
	}

	public void scrolldown(int pixel, WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + pixel + ")");
	}

	public void switchNew(WebDriver driver) {

		// String mainpage = driver.getWindowHandle();
		try {
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

			System.out.println("array list count" + newTb.size());
			System.out.println(newTb);
			String child = newTb.get(0);

			String last = newTb.get(1);
			
			  driver.switchTo().window(last);
			 /* 
			 * System.out.println(driver.getTitle()); //String currenturl =
			 * driver.getTitle();
			 * 
			 * 
			 * try { verifyEquals(currenturl, "Untitled Document", driver);
			 * System.out.println("-- Print page verified successfully"); } catch
			 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
			 * 
			 * driver.switchTo().window(child); driver.close();
			 * driver.switchTo().window(homepage);
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}