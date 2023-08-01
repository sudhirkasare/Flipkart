package CustomerLogin;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Deposite extends SelectAccountNo{

	public Deposite(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = ".//input[@placeholder='amount']")
	private WebElement amount;
	@FindBy(xpath = ".//button[@class='btn btn-default']")
	private WebElement deposite;
	
	public void EnterAmount(String amt) {
		amount.sendKeys(amt);
	}
	public void ClickOnDepositeButton() {
		deposite.click();
	}
	@FindBy(xpath = ".//button[@ng-click='back()']")
	private WebElement back;
	
	public void ClickOnBack1() {
		back.click();
	}
}