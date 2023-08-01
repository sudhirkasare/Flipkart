package BankManagerlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Manager extends BankManagerlogin {

	public Manager(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//button[@ng-click='addCust()']")
	private WebElement addcustomer;

	@FindBy(xpath = ".//button[@ng-click='openAccount()']")
	private WebElement openaccount;

	@FindBy(xpath = ".//button[@ng-click='showCust()']")
	private WebElement customer;

	public void clickOnAddCustomer() {
		addcustomer.click();
	}

	public void clickOnOpenAccount() {
		openaccount.click();
	}

	public void clickOnShowCustomer() {
		customer.click();
	}
}