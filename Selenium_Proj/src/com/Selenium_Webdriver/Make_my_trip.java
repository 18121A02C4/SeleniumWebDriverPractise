package com.Selenium_Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_my_trip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div//div//p[@class='font14 appendBottom5 blackText']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equals("Chennai, India")){
				list.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label/span")).click();

		List<WebElement> list1 = driver.findElements(By.xpath("//div[@id=\"react-autowhatever-1\"]//div//ul//li//div//p[@class='font14 appendBottom5 blackText']"));
		System.out.println(list1.size());
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i).getText().equals("Pune, India")){
				list1.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")).click();

		String date="December2022";
        String day="9";
        while(true)
        {
            String text1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")).getText();
            String text2=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div")).getText();
            System.out.println(text1);
            if(date.equals(text1))
            {
            	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]//div[@class='dateInnerCell']//p[text()='"+day+"']")).click();
                break;
            }
            else if(date.equals(text2)) {
            	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]//div[@class='dateInnerCell']//p[text()='"+day+"']")).click();

            	break;
            }
            else
            {
                driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
            }
        }
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/label/span")).click();

		String datr="August2023";
        String dar="21";
        while(true)
        {
            String text1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")).getText();
            String text2=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div")).getText();
            System.out.println(text1);
            if(datr.equals(text1))
            {
            	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]//div[@class='dateInnerCell']//p[text()='"+dar+"']")).click();
                break;
            }
            else if(datr.equals(text2)) {
            	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]//div[@class='dateInnerCell']//p[text()='"+dar+"']")).click();

            	break;
            }
            else
            {
                driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
            }								//*[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]
        }
       
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[2]/div/p[1]")).click();
		
		
		/*right*/    //*[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]
		/*left*/     //*[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]
		//div[@class='dateInnerCell']//p[text()='1']
		//*[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]//div[@class='dateInnerCell']//p[text()='22']
	}

}
//*[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[5]/div//p[text()='shs']
