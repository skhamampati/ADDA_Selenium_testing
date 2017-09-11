package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MapAndChartDisplayPage extends BasePage{

	// Elements
		public By optionYear = By.xpath(".//*[@id='yearLookUpId']"); 
		public By reportingOption = By.xpath(".//*[@id='reportingOptionLookupId']");
		public By parameterName = By.xpath(".//*[@id='parameterLookupId']");
		public By reportingType = By.xpath(".//*[@id='reportTypeId']");
		public By submit = By.xpath(".//*[@id='displayreport']");
		public By option = By.xpath(".//*[@id='reportTypeId']/option[2]");
		
		
		// User Actions
		public void selectOptionYear(String year) {
			Select oSelect = new Select(driver.findElement(optionYear));
			oSelect.selectByValue(year);
		}	
		
		public void SelectReportingOption(String report) {
			Select oSelect = new Select(driver.findElement(reportingOption));
			oSelect.selectByValue(report);
		}	
		
		public void selectParameterName(String name) {
			Select oSelect = new Select(driver.findElement(parameterName));
			oSelect.selectByValue(name);
		}	
		
		public void selectReportingType(String type) {
			Select oSelect = new Select(driver.findElement(reportingType));
			oSelect.selectByValue(type);
		}	
		
		public void selectYesOrNoOption(String type) {
			Select oSelect = new Select(driver.findElement(option));
			oSelect.selectByValue(type);
		}	
		
		public void clickOnSubmitButton(){
			driver.findElement(submit).click();
		}
}
