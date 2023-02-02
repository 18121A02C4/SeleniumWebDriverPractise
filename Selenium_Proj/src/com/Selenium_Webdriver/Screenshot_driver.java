package com.Selenium_Webdriver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","C:\\\\Users\\\\Shashank.Peta\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Spider-Man");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		 File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(f, new File("C:\\Users\\Shashank.Peta\\eclipse-workspace\\Selenium_Proj\\sc1.png"));

	}

}
