package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage{

	// Elements
		public By home = By.xpath(".//*[@id='header']/nav/div/table/tbody/tr[3]/td/div/ul/li[1]/a"); 
		public By upload = By.xpath(".//*[@id='header']/nav/div/table/tbody/tr[3]/td/div/ul/li[2]/a");
		public By download = By.xpath(".//*[@id='header']/nav/div/table/tbody/tr[3]/td/div/ul/li[3]/a");
		public By contactUs = By.xpath(".//*[@id='header']/nav/div/table/tbody/tr[3]/td/div/ul/li[4]/a");
		public By help = By.xpath(".//*[@id='header']/nav/div/table/tbody/tr[3]/td/div/ul/li[5]/a");
		
				
		// User Actions
		public void verifyHomeTab() {
			driver.findElement(home).isDisplayed();
		}
		
		public void verifyUploadTab() {
			driver.findElement(upload).isDisplayed();
		}
		
		public void verifyDownloadTab() {
			driver.findElement(download).isDisplayed();
		}
		
		public void verifyContactUsTab() {
			driver.findElement(contactUs).isDisplayed();
		}
		
		public void verifyHelpTab() {
			driver.findElement(help).isDisplayed();
		}		
}
