package CustomerLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLogin {

	@FindBy(xpath = ".//button[@ng-click='customer()']")
	private WebElement customerlogin;

	public CustomerLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ClickOnCustomerLogin() {
		customerlogin.click();
	}
}