	package com.SalesForcePageFactory.loginPage;
	
	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
	
	public class Login_WithConstructor {
	
		
	public  WebDriver driver;
	
	public Login_WithConstructor(WebDriver driver) {
		//super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//@FindBy(xpath="//img[@class='img-responsive']")
	@FindBy(xpath="//a[@class='dropdown-toggle disabled']")
	public WebElement login_Link;
	
	

	public WebElement clickOnLoginLink() {
		login_Link.click();
		return login_Link;
		
	}
	

	
	@FindBy(how = How.ID, using = "username")private WebElement userid;
	
	public WebElement enterYourUserName(String whatIsYourUserName) {
		userid.sendKeys(whatIsYourUserName);
		return userid;
		
	}
	
	@FindBy(how = How.CSS, using = "#password")private WebElement password;
	
	public WebElement enterYourPassword(String whatIsYourPassword) {
		password.sendKeys(whatIsYourPassword);
		return password;
		
	}
	
	
	@FindBy(how = How.CSS, using = "#Login")private WebElement submit;
	
	public WebElement clickOnSubmitButton() {
		submit.sendKeys(Keys.ENTER);
		return submit;
		
	}
	
	public WebElement loginPage(String whatIsYourUserName, String whatIsYourPassword) {
		this.clickOnLoginLink();
		this.enterYourUserName(whatIsYourUserName);
		this.enterYourPassword( whatIsYourPassword);
		return this.clickOnSubmitButton();
	}
	}
