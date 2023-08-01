package CustomerLogin;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectAccountNo extends SelectCustomerName {

	public SelectAccountNo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = ".//select[@id='accountSelect']")
	private WebElement selectaccount;
	@FindBy(xpath = ".//button[@ng-click='transactions()']")
	private WebElement transaction;
	@FindBy(xpath = ".//button[@ng-click='deposit()']")
	private WebElement deposite;
	@FindBy(xpath = ".//button[@ng-click='withdrawl()']")
	private WebElement withdrawl;
	
	public void SelectAccountNo(String no) {
		
		selectaccount.sendKeys(no);
		selectaccount.click();
		//Select s=new Select(selectaccount);
		//s.selectByIndex(2);
		
	}
	public void ShowTransaction() {
		transaction.click();
	}
	public void ClickOnDeposite() {
		deposite.click();
	}
	public void ClickOnWithdrawl() {
		withdrawl.click();
	}
}