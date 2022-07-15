package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redBus {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window();
		
		//Launch the url https://www.redbus.in/
		driver.navigate().to("https://www.redbus.in/");
		
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter From -Madiwala Bangalore
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Madiwala Bangalore",Keys.ENTER);
		
		//Enter To Koyambedu Chennai
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Koyambedu Chennai", Keys.ENTER, Keys.TAB);
		
		
		//Select the Date 10-Jun-2022
		
		driver.findElement(By.xpath("//td[text()='10']")).click();
		
		//Click Search buses
	//	driver.findElement(By.id("search_btn")).click();
	driver.findElement(By.xpath("//div[@class='clearfix search-wrap']//button")).click();	
	//	driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		
		
		//Click After 6pm under Departure time
		driver.findElement(By.xpath("//input[@id='dtAfter 6 pm']")).click();
		
		//Click Sleeper under Bus types
		driver.findElement(By.xpath("//input[@id='bt_SLEEPER']")).click();
		
		//Select the Primo
		driver.findElement(By.xpath("//ul[@class='addn-filters']/li[2]")).click();
		
		
		
		
		
		
		
		
		
		
	}
	
}
