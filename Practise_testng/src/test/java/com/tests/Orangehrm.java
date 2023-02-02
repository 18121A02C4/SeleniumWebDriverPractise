package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrm {
	WebDriver driver;
	@BeforeTest
	public void initialisebrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	@Test
	public void login() {
		
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("innovaacs");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("Devil@777");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
	}
	@Test
	public void verifyLogin() {
//		 driver=new ChromeDriver();

		driver.switchTo().frame("mainpanel");

		String s=driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")).getText();
		System.out.println(s);
	}
	@Test
	public void checkContacts() {
//		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/table[1]"));

		String s=driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[4]/td[2]/a")).getText();
		System.out.println(s);


	}
	@Test
	public void navigateToContacts() throws InterruptedException {
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a")).click();
		
	}

}
