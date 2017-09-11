package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HighExclusion extends BasePage{

	// Elements
		public By optionExcFre = By.xpath(".//*[@id='excluFreqRowId']"); 
		public By optionYear = By.xpath(".//*[@id='excluFreqRowId']/option[2]");
		public By searchName = By.xpath(".//*[@id='automplete-1']");
		public By measureName = By.xpath(".//*[@id='measureLookupId']");
		public By reportType = By.xpath(".//*[@id='reportTypeId']");
		public By submit = By.xpath(".//*[@id='displayreport']");
		
		
		// User Actions
		public void exclusionFrequencyOption(String type) {
			Select oSelect = new Select(driver.findElement(optionExcFre));
			oSelect.selectByValue(type);
		}	
		
		public void selectYear(String year) {
			Select oSelect = new Select(driver.findElement(optionYear));
			oSelect.selectByValue(year);
		}	
		
		public void searchByNameId(String name) {
			Select oSelect = new Select(driver.findElement(searchName));
			oSelect.selectByValue(name);
		}	
		
		public void measureNameAutoselected(String name) {
			Select oSelect = new Select(driver.findElement(measureName));
			oSelect.selectByValue(name);
		}	
		
		public void selectReportOtion(String type) {
			Select oSelect = new Select(driver.findElement(reportType));
			oSelect.selectByValue(type);
		}	
		
		public void clickOnSubmitButton(){
			driver.findElement(submit).click();
		}
}
