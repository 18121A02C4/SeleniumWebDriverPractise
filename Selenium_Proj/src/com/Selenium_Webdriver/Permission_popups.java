package com.Selenium_Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permission_popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Shashank.Peta\\\\\\\\eclipse-workspace\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");

		ChromeOptions options =new ChromeOptions();
		options.addArguments("disable-media-stream");
		WebDriver driver = new ChromeDriver(options); // launch chrome
		driver.get("https://mictests.com/");

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"mic-launcher\"]")).click();
		Thread.sleep(3000);

	}

}
