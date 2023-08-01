package CustomerLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Transaction extends Withdrawl{

	public Transaction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = ".//button[@ng-click='reset()']")
	private WebElement reset;
	
	public void ClickOnReset() {
		reset.click();
	}
	@FindBy(xpath = ".//button[@ng-click='back()']")
	private WebElement back;
	
	public void ClickOnBack() {
		back.click();
	}
}