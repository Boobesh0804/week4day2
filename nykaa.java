package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class nykaa {

	private static final CharSequence Keys = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window();
		
		//1) Go to https://www.nykaa.com/
		driver.navigate().to("https://www.nykaa.com/");
		
		//2) Click Brands and Search L'Oreal Paris
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[@class='css-1fp0xcn']")).sendKeys("L'Oreal Paris");
		
	}
}
