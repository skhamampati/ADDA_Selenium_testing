package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
	// Elements
	public By uName = By.xpath(".//*[@id='log_in']/div/div/form/div/input[1]");
	public By pWord = By.xpath(".//*[@id='log_in']/div/div/form/div/input[2]");
	public By login = By.xpath(".//*[@id='log_in']/div/div/form/button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.url = super.url;
	}
	
	// User Actions
	public void enterUsername(String username) {
		driver.findElement(uName).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(pWord).sendKeys(password);
	}
	
	public void clickSubmit() {
		driver.findElement(login).click();
	}
	
}
