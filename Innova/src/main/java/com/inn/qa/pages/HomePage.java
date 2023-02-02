package com.inn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inn.qa.pages.MainPage;
import com.inn.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//*[@id=\":rj:\"]/p")
	WebElement text;
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement closeButton;

	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	public boolean verifyAlert() {
		return text.isDisplayed();
		
	}
	
	public MainPage clickOnCrossButton() {
		// TODO Auto-generated method stub
		closeButton.click();
		return new MainPage();	}

}
