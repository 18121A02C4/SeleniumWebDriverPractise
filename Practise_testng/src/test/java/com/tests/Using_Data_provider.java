package com.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_Data_provider {
	
	@Test(dataProvider = "getData",dataProviderClass=Excel_DataProvider.class)
	public void TestLogin(String userName, String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		System.out.println("we are running"+a+"iteration");
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
//		Assert.assertTrue(driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")).isDisplayed());
		Thread.sleep(5000);
//		driver.quit();
	}
	
	@DataProvider
	public Object[][] loginData() {
		Object[][] data = new Object[3][3];
		data[0][0] = "innovaacs";
		data[0][1] = "Devil@777";
		data[0][2]=0;
		
		data[1][0] = "innovaacs";
		data[1][1] = "Devil@777";
		data[1][2]=1;

		data[2][0] = "innovaacs";
		data[2][1] = "Devil@777";
		data[2][2]=2;

		
		
		
		return data;
	}
}

