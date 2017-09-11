package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage{

	// Elements
		public By image = By.xpath(".//*[@id='mid']/img"); 
		
				
		// User Actions
		public void verifyImage() {
			driver.findElement(image).click();
		}	
		
}