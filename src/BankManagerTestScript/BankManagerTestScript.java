package BankManagerTestScript;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BankManagerlogin.ShowCustomers;


public class BankManagerTestScript  {
	WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
	public void openLink() {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}	@Test
		public void AllMethod() throws InterruptedException {
			ShowCustomers s=new ShowCustomers(driver);
			s.clickonLogin();
			Thread.sleep(2000);
			s.clickOnAddCustomer();
			Thread.sleep(1000);
			s.EnterOnFirstName("sudhir");
			Thread.sleep(1000);
			s.EnterOnLastName("kasare");
			Thread.sleep(1000);
			s.EnterOnPostCode("0001");
			Thread.sleep(2000);
			s.ClickOnAddCustomer();
			Alert a=driver.switchTo().alert();
			a.accept();
			s.clickOnOpenAccount();
			Thread.sleep(3000);
			s.SelectCustomerName("sudhir kasare");
			Thread.sleep(2000);
			s.SelectCurrency();
			Thread.sleep(1000);
			s.ClickonProcess();
			a.accept();
			s.clickOnShowCustomer();
			s.SearchCustomer("sudhir");
			Thread.sleep(3000);
			s.ClickOnDelete();
			driver.switchTo().parentFrame();
/*		s.ClickOnHome();
			Transaction t=new Transaction(driver);
			Thread.sleep(5000);
			t.ClickOnCustomerLogin();
			Thread.sleep(1000);
			t.SelectCustomerName();
			Thread.sleep(1000);
			t.ClickOnCustomerLoginButton();
			Thread.sleep(1000);
			t.SelectAccountNo();
			Thread.sleep(3000);
			t.EnterAmount("10000");
			t.ClickOnDeposite();
			t.ClickOnBack();
			Thread.sleep(3000);
			t.ClickOnWithdrawl();
			t.EnterWithdrawlAmount("5000");
			t.ClickOnWithdrawlbutton();
			t.ClickOnBack();
			Thread.sleep(1000);
			t.ShowTransaction();
			Thread.sleep(5000);
			t.ClickOnReset();*/
		}
}
