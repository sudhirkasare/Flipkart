package BankManagerlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPom extends AddCustomerPom {

	public OpenAccountPom(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//select[@id='userSelect']")
	private WebElement customername;
	@FindBy(xpath = ".//select[@id='currency']")
	private WebElement currency;
	@FindBy(xpath = ".//button[.='Process']")
	private WebElement process;

	public void SelectCustomerName(String name) {
		customername.click();
		customername.sendKeys(name);
		// Select s=new Select(customername);

		// s.selectByIndex(2);
	}

	public void SelectCurrency() {
		currency.click();
		Select s = new Select(currency);
		s.selectByIndex(3);
	}

	public void ClickonProcess() {
		process.click();
	}
}