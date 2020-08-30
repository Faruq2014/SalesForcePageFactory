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
	 
	@FindBy(xpath="//img[@class='img-responsive']")
		public WebElement login_Link;
		

		public void clickOnLoginLink() {
			login_Link.click();
			
		}
		
		//driver.findElement(By.xpath("(//div[@class='dropdown']/a)[2]")).click();
		
		@FindBy(how = How.ID, using = "username")private WebElement userid;
		
		public void enterYourUserName(String enterUserId) {
			userid.sendKeys(enterUserId);
			
		}
		
		@FindBy(how = How.CSS, using = "#password")private WebElement password;
		
		public void enterYourPassword(String enterPassword) {
			password.sendKeys(enterPassword);
			
		}
		
		
		@FindBy(how = How.CSS, using = "#Login")private WebElement submit;
		
		public void clickOnSubmitButton() {
			submit.sendKeys(Keys.ENTER);
			
		}

	}


