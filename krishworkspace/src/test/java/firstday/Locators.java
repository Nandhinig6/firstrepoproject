package firstday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.cssSelector("#login2")).click();
		driver.findElement(By.cssSelector("#loginusername")).sendKeys("kk");
		driver.findElement(By.cssSelector("#loginpassword")).sendKeys("kk");
		driver.findElement(By.cssSelector("#loginpassword")).sendKeys("kk");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@xpath=1 and text()=\'Close\']")).click();
				
		
		
		
		

	}

}
