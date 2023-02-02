package com.Selenium_Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Shashank.Peta\\\\\\\\eclipse-workspace\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.lambdatest.com/blog/how-to-use-javascriptexecutor-in-selenium-webdriver/");
//		driver.get("https://ui.freecrm.com/");
//		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement w1=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input"));
//		WebElement w2=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input"));
//		WebElement w3=driver.findElement(By.xpath("//div[text()='Login']"));
//
//
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value='psreddy072@gmail.com'",w1);
//		js.executeScript("arguments[0].value='Devil@777'",w2);
//		js.executeScript("arguments[0].click()",w3);
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1812384075%3A1668770311535066&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAu58CvW0yNeZwHGG5Xycd_RTmVQE0frK1c7FmD6NYgRwk50DNZX6tYn11UPlCJxL2XHITQuRw");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		int i=12;
		while(i>0) {
			js.executeScript("document.getElementById('identifierId').setAttribute('style','border:white;background:orange')");
			Thread.sleep(1000);
			js.executeScript("document.getElementById('identifierId').setAttribute('style','border:white;background:')");
			Thread.sleep(1000);

			js.executeScript("document.getElementById('identifierId').setAttribute('style','border:white;background:green')");
			Thread.sleep(1000);
			i--;

			

			
		}

		

		
		

	}

}
