package com.Selenium_Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce_demo_qns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","C:\\\\Users\\\\Shashank.Peta\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("problem_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		float max=0;
		for(WebElement e:li) {
			String s=e.getText().replaceAll("[^A-Za-z0-9.]","");
			float a=Float.valueOf(s);
			if(a>max) {
				max=a;
			}
			
		}
		System.out.println(max);
		String m=String.valueOf(max);
		System.out.println(driver.findElement(By.xpath("//div[@class='inventory_item_price' and text()='"+m+"']/following-sibling::button[text()='Add to cart']")).isDisplayed());
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));

	}

}
