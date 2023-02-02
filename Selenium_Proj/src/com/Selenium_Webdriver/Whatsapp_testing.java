package com.Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp_testing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Shashank.Peta\\\\\\\\eclipse-workspace\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(50000);
		
		driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/div/div[2]/div/div[2]")).sendKeys("Rishi (EEE-B)");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Rishi (EEE-)']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]")).sendKeys(" ");
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button/span")).click();


//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));

		
	}
}
