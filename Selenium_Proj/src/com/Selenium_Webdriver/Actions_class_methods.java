package com.Selenium_Webdriver;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class_methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver","C:\\\\Users\\\\Shashank.Peta\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions act=new Actions(driver);
		WebElement w=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Thread.sleep(3000);
		act.moveToElement(w).build().perform();
		WebElement w1=driver.findElement(By.xpath("//a[text()='Apple']"));
		Thread.sleep(3000);
		w1.click();
		WebElement w2=driver.findElement(By.xpath("//div[text()='Mac Mini (2018)']"));
		w2.click();
		driver.findElement(By.xpath("//ul[@class='carousel__list']/descendant::p[text()='8 GB']")).click();
		driver.findElement(By.xpath("//ul[@class='b-list__items_nofooter srp-results srp-grid']/descendant::h3[text()='Mac Mini 3.6GHz Quad‐Core Intel Core i3 - 2018']")).click();
//		driver.findElement(By.xpath("//ul[@class='b-list__items_nofooter srp-results srp-grid']/descendant::h3[text()='Late 2018 Mac Mini Core i3 3.6GHz, 128GB SSD (Intel Core i3, 3.60 GHz,8gb RAM)']")).click();
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		Iterator<String> it=handles.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//ul[@class='x-buybox-cta']/descendant::span[text()='Buy It Now']")).click();
		driver.findElement(By.xpath("//span[text()='Sign in to check out']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"s0-71-captcha-ui\"]/iframe")));
		driver.findElement(By.xpath("//div[text()='I am human']")).click();
		
		



	}

}
