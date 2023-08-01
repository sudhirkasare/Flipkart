package CustomerTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import CustomerLogin.Transaction;

public class CustomerTest {

	WebDriver driver = new FirefoxDriver();

	@BeforeTest
	public void openLink() {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void Customermethods() throws InterruptedException {
		Transaction t = new Transaction(driver);
		Thread.sleep(5000);
		t.ClickOnCustomerLogin();
		t.SelectCustomerName("Harry Potter");
		t.ClickOnCustomerLoginButton();
		t.SelectAccountNo("1006");
		t.ClickOnDeposite();
		t.EnterAmount("10000");
		t.ClickOnDepositeButton();
		// t.ClickOnBack1();
		t.ClickOnWithdrawl();
		t.EnterWithdrawlAmount("5000");
		t.ClickOnWithdrawlbutton();
		// t.ClickOnBack2();
		t.ShowTransaction();
		t.ClickOnReset();
	}
}