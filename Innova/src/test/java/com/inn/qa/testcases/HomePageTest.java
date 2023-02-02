package com.inn.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inn.qa.base.TestBase;
import com.inn.qa.pages.MainPage;
import com.inn.qa.pages.HomePage;
import com.inn.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage; 
	HomePage homePage;
	TestUtil testUtil;
	MainPage mainPage;
	public HomePageTest() {
		super();
		System.out.println("first");
		System.out.println("constructor");
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		testUtil=new TestUtil();
		loginPage = new LoginPage();	
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	@Test(priority=1)
	public void verifyAlertTest() {
		boolean alertText=homePage.verifyAlert();
		Assert.assertTrue(alertText);
		
	}
	@Test(priority=2)
	public void verifyCrossButtonTest() {
		mainPage=homePage.clickOnCrossButton();

	}
//	@Test(priority=3)
//	public void verifyContactsLinkTest() {
//		testUtil.switchToFrame();
//		contactsPage=homePage.clickOnContactsLink();
//	}
	
	@AfterMethod
	public void tearDown(){
//		driver.quit();
	}
}
