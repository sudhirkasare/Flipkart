package BankManagerlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPom extends Manager {

	public AddCustomerPom(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = ".//input[@placeholder='First Name']")
	private WebElement FirstName;
	@FindBy(xpath = ".//input[@placeholder='Last Name']")
	private WebElement LastName;
	@FindBy(xpath = ".//input[@placeholder='Post Code']")
	private WebElement Postcode;
	@FindBy(xpath = ".//button[contains(@class,'btn btn-default')]")
	private WebElement AddCustomerButton;

	public void EnterOnFirstName(String first) {
		FirstName.sendKeys(first);
	}

	public void EnterOnLastName(String last) {
		LastName.sendKeys(last);
	}

	public void EnterOnPostCode(String code) {
		Postcode.sendKeys(code);
	}

	public void ClickOnAddCustomer() {
		AddCustomerButton.click();
	}
}
