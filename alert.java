package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {
	
	public static void main(String[] args) {
		
	    	 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
			driver.manage().window();
			
			//Click the button to display a alert box.
			
			driver.navigate().to("http://www.leafground.com/pages/Alert.html");
			
			driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
			
			Alert alert = driver.switchTo().alert();
			
			String text = alert.getText();
			
			System.out.println(text);
			
			alert.accept();
			
			
			//Click the button to display a confirm box.
			
			driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
			alert.dismiss();
			String text2 = driver.findElement(By.xpath("//p[@id='result']")).getText();
			System.out.println(text2);
			
			//Click the button to display a prompt box.
			
			driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
			alert.sendKeys("udemy");
			alert.accept();
			String text3 = driver.findElement(By.xpath("//p[@id='result1']")).getText();
			System.out.println(text3);
			
			
		
	}
	

}
