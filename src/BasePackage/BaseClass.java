package BasePackage;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriver driver = new FirefoxDriver();
	@BeforeClass
	public void baseTest() {

		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}