package com.Selenium_Webdriver;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Shashank.Peta\\\\\\\\eclipse-workspace\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("group1");
//		
//		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
//		System.out.println(list);
//		System.out.println("total number of suggestions in search box:::===>" + list.size());
//		
//		for(int i=0; i<list.size(); i++){
//			System.out.println(list.get(i).getText());
//			if(list.get(i).getText().contains("group 1 syllabus 2022")){
//				list.get(i).click();
//				break;
//			}
//			
//		}
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("group1");
		
//		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div/ul//li/descendant::div[@class=\"wM6W7d\"]"));
List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div//ul//li/descendant::div[@class='wM6W7d']"));

		System.out.println(list);
		System.out.println("total number of suggestions in search box:::===>" + list.size());
		
		

		
		
		
	}

}