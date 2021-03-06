package com.SalesForcePageFactory.login;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.SalesForcePageFactory.base.BaseTest;
import com.SalesForcePageFactory.loginPage.LoginPage;

public class LoginTest extends BaseTest{
	//public  WebDriver driver;
	/*
	@BeforeClass
	public void setUP() {
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.silentOutput","true"); 
		driver = new ChromeDriver(options);
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	*/
@Test
public void loginTestWithValidCredential() {
	System.out.println("Assalamualaikum");
	// both constructors are availabe, we are using super constructor.
	//LoginPage lp = new LoginPage(driver); 
	LoginPage lp = new LoginPage();
	PageFactory.initElements(driver, lp);
	lp.clickOnLoginLink();
	lp.enterYourUserName("aaaaaaa");
	lp.enterYourPassword("1234");
	lp.clickOnSubmitButton();
}
/*
@AfterClass
public void destroy_setUp() {
	driver.quit();
}
*/
}
