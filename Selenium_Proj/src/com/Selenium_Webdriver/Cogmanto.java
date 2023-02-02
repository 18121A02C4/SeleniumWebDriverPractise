package com.Selenium_Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cogmanto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Shashank.Peta\\\\\\\\eclipse-workspace\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Shashank.Peta\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//
//		//Creating an object of EdgeDriver
//		WebDriver driver = new EdgeDriver();

		

		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("psreddy0712@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("Devil@777");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
//		Actions act=new Actions(driver);
//		act.moveToElement(w).click().build().perform();
		//a[text()='spider man']//parent::td//preceding-sibling::td//input[@name='id']
//		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()='spider man']//parent::td//preceding-sibling::td//input[@name='id']")).click();
		driver.findElement(By.xpath("")).click();
	}

}
