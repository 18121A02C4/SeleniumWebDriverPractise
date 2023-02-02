package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyfirstTest {
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
	public void Testgoogle() {
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("maven",Keys.ENTER);
		System.out.println(driver.getTitle());
		
		
		
	}
	@Test
	public void Testfacebook() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("maven",Keys.ENTER);
		System.out.println(driver.getTitle());
		
		
		
	}
}
