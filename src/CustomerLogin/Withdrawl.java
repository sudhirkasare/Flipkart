package CustomerLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Withdrawl extends Deposite{

	public Withdrawl(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = ".//input[@ng-model='amount']")
	private WebElement amount;
	@FindBy(xpath = ".//button[@class='btn btn-default']")
	private WebElement withdrwal;
	@FindBy(xpath = ".//button[@ng-click='back()']")
	private WebElement back;
	
	public void EnterWithdrawlAmount(String amt) {
		amount.sendKeys(amt);
	}
	public void ClickOnWithdrawlbutton() {
		withdrwal.click();
	}
	
	public void ClickOnBack2() {
		back.click();
	}
}