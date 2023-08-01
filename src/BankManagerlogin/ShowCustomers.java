package BankManagerlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShowCustomers extends OpenAccountPom {
	public ShowCustomers(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//input[@placeholder='Search Customer']")
	private WebElement searchName;
	@FindBy(xpath = ".//button[@ng-click=\"deleteCust(cust)\"]")
	private WebElement delete;
	@FindBy(xpath = ".//button[@ng-click='home()']")
	private WebElement home;

	public void SearchCustomer(String Custname) {
		searchName.sendKeys(Custname);
	}

	public void ClickOnDelete() {
		delete.click();
	}

	public void ClickOnHome() {
		home.click();
	}
}