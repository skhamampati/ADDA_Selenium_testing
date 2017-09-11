package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage{

	// Elements
		public By logout = By.xpath(".//*[@id='header']/nav/div/table/tbody/tr[1]/td[2]/div/a"); 
			
				
		// User Actions
		public void clickOnLogout() {
			driver.findElement(logout).click();
		}	
}