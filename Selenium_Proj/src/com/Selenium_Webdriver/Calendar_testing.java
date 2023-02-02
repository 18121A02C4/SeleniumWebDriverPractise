package com.Selenium_Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Calendar_testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Shashank.Peta\\\\\\\\eclipse-workspace\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Shashank.Peta\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//
//		//Creating an object of EdgeDriver
//		WebDriver driver = new EdgeDriver();

		

		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("innovaacs");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("Devil@777");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		driver.manage().window().maximize(); // maximize window
//		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("mainpanel");
		//*[@id="navmenu"]/ul/li[4]/a
		driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/table[1]"));
		String s=driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[4]/td[2]/a")).getText();
		System.out.println(s);
//		driver.findElement(By.xpath("//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[3]/td[4]")).click();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//*[@id="loginForm"]/input[1]
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("innovaacs");
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("Devil@777");
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
//		driver.switchTo().frame("mainpanel");
//
//		driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[10]/a")).click();


	}

}
