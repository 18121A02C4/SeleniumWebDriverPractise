package com.Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Webpage_Open {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","C:\\Users\\Shashank.Peta\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		WebDriver driver1=new ChromeDriver();

//		driver1.get("https://parabank.parasoft.com/parabank/index.htm");
//		driver.get("https://demoqa.com/text-box");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("userName")).sendKeys("shashank");
//		driver.findElement(By.id("userEmail")).sendKeys("shashank@gmail.com");
//		driver.findElement(By.id("currentAddress")).sendKeys("chennai");
//		driver.findElement(By.id("permanentAddress")).sendKeys("tirupati");
//		driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.get("https://www.youtube.com/");
		Thread.sleep(25000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("selenium");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@title='Selenium Full Course - Learn Selenium in 12 Hours | Selenium Tutorial For Beginners | Edureka']")).click();
		


		

		

	}

}
