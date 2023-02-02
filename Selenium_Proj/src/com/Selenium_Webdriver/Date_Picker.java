package com.Selenium_Webdriver;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Shashank.Peta\\\\\\\\eclipse-workspace\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String date="24-December-2022";
		String[] date_array=date.split("-");
		String day=date_array[0];
		String month=date_array[1];
		String year=date_array[2];
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		h.put("January",1);
		h.put("February",2);
		h.put("March",3);
		h.put("April",4);
		h.put("May",5);
		h.put("June",6);
		h.put("July",7);
		h.put("August",8);
		h.put("September",9);
		h.put("October",10);
		h.put("November",11);
		h.put("December", 12);

		
		System.out.println(day+" "+month+" "+year);
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 

		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[1]/p/iframe")));

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		WebElement w=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		String mon=w.getText();
		System.out.println(mon);
		WebElement x=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		String yr =x.getText();
		System.out.println(yr);
		
    if(Integer.parseInt(year)>Integer.parseInt(yr)) {
    	WebElement s=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		String y =s.getText();
    	while(!(year.equals(y))) {
    		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
    		 s=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
    		 y =s.getText();
    	}


    
    	WebElement r=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		String j=r.getText();
		if(h.get(j)>h.get(month)) {
			System.out.println("this print statement nevwr works for yr greate than current year");
			while(!(month.equals(j))) {
	    		r=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
	    		j=r.getText();

			}
			driver.findElement(By.xpath("//a[text()="+day+"]")).click();

			
		}
		else if(h.get(j)==h.get(month)) {
			System.out.println("this print statement only works for yr greate than current year when current month is january");

			driver.findElement(By.xpath("//a[text()="+day+"]")).click();

		}
		else {
			System.out.println("this print statement only works for yr greate than current year");

			while(!(month.equals(j))) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();

	    		r=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
	    		j=r.getText();

			}
			driver.findElement(By.xpath("//a[text()="+day+"]")).click();

		}

    }
    else if(year.equals(yr)) {
    	System.out.println("hello");
    	WebElement r=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		String j=r.getText();
		if(h.get(j)>h.get(month)) {
			System.out.println("this will work when given month is previous to present month");
			while(!(month.equals(j))) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();//prev
	    		r=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
	    		j=r.getText();

			}
			driver.findElement(By.xpath("//a[text()="+day+"]")).click();

			
		}
		else if(h.get(j)==h.get(month)) {
			System.out.println("this will when avail mon and given mon are same");
			driver.findElement(By.xpath("//a[text()="+day+"]")).click();

		}
		else {
			System.out.println("this will work when given month is next to present month");

			while(!(month.equals(j))) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();//next

	    		r=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
	    		j=r.getText();

			}
			driver.findElement(By.xpath("//a[text()="+day+"]")).click();

		}
    	
    }
    else {
    	WebElement s=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		String y =s.getText();
		System.out.println(year);
		System.out.println(y);
    	while(!(year.equals(y))) {
    	    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();//prev
    	    s=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
    	    y =s.getText();
    	}
    	WebElement r=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		String j=r.getText();
		System.out.println(h.get(j));
		System.out.println(h.get(month));
		if(h.get(j)>h.get(month)) {
			System.out.println("this state ment will only work majorly when the given yr is less than the current year");
			while(!(month.equals(j))) {

				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();//prev
	    		r=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
	    		j=r.getText();

			}
			driver.findElement(By.xpath("//a[text()="+day+"]")).click();

			
		}
		else if(h.get(j)==h.get(month)) {
			System.out.println("this will work when the given month is december");
			driver.findElement(By.xpath("//a[text()="+day+"]")).click();

		}
		else {
			while(!(month.equals(j))) {
				System.out.println("this statement will never work");
	    		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
	    		r=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
	    		j=r.getText();

			}
			driver.findElement(By.xpath("//a[text()="+day+"]")).click();

			
		}

    	
    }
		
		
		
		
		



		



	}

}
