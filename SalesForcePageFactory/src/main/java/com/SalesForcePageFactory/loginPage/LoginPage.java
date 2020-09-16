package com.SalesForcePageFactory.loginPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
	  public WebDriver driver;
	  
	  public LoginPage(WebDriver driver) { this.driver= driver; } 
	  //user define constructor
	  // i really do not need this constructor, just to show how it works with 
	  // zero arguments constructor or super constructor below. 
	  //it is recommended to create zero arguments constructor with user define  constructor.
	  public LoginPage() { super();
	  
	  }
	 
	//@FindBy(xpath="//img[@class='img-responsive']")
	@FindBy(xpath="//a[@class='dropdown-toggle disabled']")
		public WebElement login_Link;
		

		public WebElement clickOnLoginLink() {
			login_Link.click();
			return login_Link;
			
		}
		
		//driver.findElement(By.xpath("(//div[@class='dropdown']/a)[2]")).click();
		
		@FindBy(how = How.ID, using = "username")private WebElement userid;
		
		public WebElement enterYourUserName(String enterUserId) {
			userid.sendKeys(enterUserId);
			return userid;
			
		}
		
		@FindBy(how = How.CSS, using = "#password")private WebElement password;
		
		public WebElement enterYourPassword(String enterPassword) {
			password.sendKeys(enterPassword);
			return password;
			
		}
		
		
		@FindBy(how = How.CSS, using = "#Login")private WebElement submit;
		
		public WebElement clickOnSubmitButton() {
			submit.sendKeys(Keys.ENTER);
			return submit;
			
		}

	}


