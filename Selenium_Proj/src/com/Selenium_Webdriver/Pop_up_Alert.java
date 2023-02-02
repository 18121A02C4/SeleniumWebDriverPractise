package com.Selenium_Webdriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pop_up_Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver","C:\\\\Users\\\\Shashank.Peta\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/upload-download");
//		driver.manage().window().maximize();
//		WebElement bro=driver.findElement(By.xpath("//input[@id='uploadFile']"));
//		bro.sendKeys("C:\\Users\\Shashank.Peta\\Desktop\\Filehandling\\joker.txt");
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String s=alert.getText();
		System.out.println(s);
		alert.accept();

		
		
	}

}
