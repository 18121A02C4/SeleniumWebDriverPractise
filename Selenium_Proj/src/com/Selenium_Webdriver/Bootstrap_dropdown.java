package com.Selenium_Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Shashank.Peta\\\\\\\\eclipse-workspace\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();

		List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"multiselect-container dropdown-menu\"]//li//a//label"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i).getText());
			if(list.get(i).isSelected()) {
//				continue;
				System.out.println(true);
			
			}
//			else {
//				list.get(i).click();
//			}
		}
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i).getText());
//			if((list.get(i).getText()).equals("Java")) {
//				Thread.sleep(3000);
//				list.get(i).click();
//				break;
//			}
//		}
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).isSelected()) {
//				list.get(i).click();
//			}
//			else {
//				continue;
//			}
//		}
		

	}
}


