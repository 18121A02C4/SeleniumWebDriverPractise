package com.Selenium_Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statle_Element_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","C:\\\\Users\\\\Shashank.Peta\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement user=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]"));
		user.sendKeys("innovaacs");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]"));
		pass.sendKeys("Devil@777");
		
		WebElement pass1=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]"));
		pass1.clear();
		pass1.sendKeys("Devil@7777");
		WebElement user1=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]"));
		user1.clear();
		user.sendKeys("innovaacs");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		driver.manage().window().maximize();
		


	}

}
