package com.Selenium_Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class World_Population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","C:\\\\Users\\\\Shashank.Peta\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=world+population&rlz=1C1CHBF_enIN1032IN1032&oq=world+population&aqs=chrome.0.69i59j0i131i433i512j0i433i512l2j0i512j0i131i433i512j0i512j69i60.9403j1j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	
		Actions act=new Actions(driver);
//		
		
		
		//*[name()='svg']//*[local-name()='g' and @class='xTick']//*[local-name()='line' and @x1='246.5' and @y1='195']
	
		
		
	}

}
