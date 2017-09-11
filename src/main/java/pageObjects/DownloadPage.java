package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DownloadPage extends BasePage{

	// Elements
		public By downloadButton = By.xpath(".//*[@id='updates']/div/div[1]/table/tbody/tr[2]/td[3]/a[1]/button"); 
		public By deleteButton = By.xpath(".//*[@id='updates']/div/div[1]/table/tbody/tr[2]/td[3]/a[2]/button");
			
				
		// User Actions	
		
		public void clickOnDownloadButton(){
			driver.findElement(downloadButton).click();
		}
		
		public void clickOnDeleteButton(){
			driver.findElement(deleteButton).click();
		}
}