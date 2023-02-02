package com.inn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inn.qa.base.TestBase;
import com.inn.qa.pages.HomePage;

public class LoginPage extends TestBase{
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign up')]")
	WebElement signUp;
	
	@FindBy(xpath="//a[@class='navbar-brand']/img[@class='img-responsive']")
	WebElement crmLogo;
	//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			System.out.println(driver.getTitle());
			return driver.getTitle();
		}
		
//		public boolean validateCRMImage(){
//			return crmLogo.isDisplayed();
//		}
		
		public HomePage login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
//			    	JavascriptExecutor js = (JavascriptExecutor)driver;
//			    	js.executeScript("arguments[0].click();", loginBtn);
			    	
			return new HomePage();
		}


}
