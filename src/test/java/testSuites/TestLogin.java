package testSuites;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import base.TestBase;
import pageObjects.LoginPage;

public class TestLogin extends TestBase {
	
	LoginPage loginPage;
	
	@BeforeMethod
	public void testSetUp() throws InterruptedException {
		loginPage = new LoginPage(driver);
		//loginPage.open();
		log.debug("Navigated to Sign In Page");
	}
	
	@Test(dataProvider="getData", description="Login Successfully with vallid details")
	public void loginTest(String fullName, String password) throws InterruptedException {

		loginPage.enterUsername(fullName);
		log.debug("Entered name: " + fullName);
		loginPage.enterPassword(password);
		log.debug("Entered password: " + password);
		Thread.sleep(5000);
		loginPage.clickSubmit();
		log.debug("Clicked submit button");
		
		loginPage.waitForElementToBeVisible(loginPage.msg);
		Assert.assertTrue(driver.findElement(loginPage.msg).isDisplayed());
	}
	
	
}
