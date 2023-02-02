package com.Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver","C:\\\\Users\\\\Shashank.Peta\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='icon']")).click();
		driver.findElement(By.xpath("//span[text()='USD - U.S. Dollar']")).click();
//		different
//		driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebElement w=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
//		Actions act=new Actions(driver);
//		Thread.sleep(3000);
//		act.moveToElement(w).build().perform();
//		driver.findElement(By.xpath("//span[text()='Create a List']")).click();
	}

}
