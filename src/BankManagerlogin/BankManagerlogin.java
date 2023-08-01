package BankManagerlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerlogin {
	@FindBy(xpath = ".//button[@ng-click='manager()']")
	private WebElement login;

	public BankManagerlogin(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void clickonLogin() {
		login.click();
	}
}