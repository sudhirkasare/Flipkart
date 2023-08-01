package CustomerLogin;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectCustomerName extends CustomerLogin{

	public SelectCustomerName(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = ".//select[@name='userSelect']")
	private WebElement SelectName;	
	
	@FindBy(xpath = ".//button[@class='btn btn-default']")
	private WebElement LoginButton;
	
	public void SelectCustomerName(String name) {
		
		SelectName.sendKeys(name);
		SelectName.click();
		//Select s=new Select(SelectName);
		//s.selectByIndex(0);
	}
	
	public void ClickOnCustomerLoginButton() {
		LoginButton.click();
	}
}