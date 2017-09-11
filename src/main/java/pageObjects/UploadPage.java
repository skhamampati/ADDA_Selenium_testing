package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UploadPage extends BasePage{

	// Elements
		public By uploadDrpDwn = By.xpath(".//*[@id='ddl1']"); 
		public By uploadButton = By.xpath(".//*[@id='provider-upload']");
		public By resetButton = By.xpath(".//*[@id='provider-reset']");	
				
		// User Actions
		public void selectItemFromDropDown(String value) {
			Select oSelect = new Select(driver.findElement(uploadDrpDwn));
			oSelect.selectByValue(value);
		}	
		
		public void clickOnUploadButton(){
			driver.findElement(uploadButton).click();
		}
		
		public void clickOnResetButton(){
			driver.findElement(resetButton).click();
		}
}