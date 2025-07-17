package day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlealerts {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Alert myalert= driver.switchTo().alert();
		
		myalert.accept();

	}

}
