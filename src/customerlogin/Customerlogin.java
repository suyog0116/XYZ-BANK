package customerlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customerlogin {
	
	@FindBy(xpath = ".//button[@ng-click='customer()']")
	private WebElement customerlogin;
	
	public Customerlogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnCustomerLogin() {
		customerlogin.click();
	}

}
