package Global_sqa_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","C:\\\\Users\\\\Shashank.Peta\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/Scrollable/");
//		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("//li[@class='price_footer']//a[text()='Scrollable']")).click();
		try {
			
			driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
		}
		catch(NoSuchElementException e) {
			System.out.println("add is not visible");
		}
		String s=driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[62]/td[4]")).getText();
		System.out.println(s);
		WebElement w;
		
		

	}

}
