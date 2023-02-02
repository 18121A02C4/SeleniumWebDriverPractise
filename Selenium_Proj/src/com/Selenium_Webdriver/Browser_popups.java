package com.Selenium_Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Browser_popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","C:\\\\Users\\\\Shashank.Peta\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement w=driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
		Thread.sleep(3000);

//		act.moveToElement(w).click().build().perform();
		act.moveToElement(w).click().build().perform();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();


	}

}
