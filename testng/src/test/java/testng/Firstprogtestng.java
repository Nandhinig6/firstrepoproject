package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firstprogtestng {
	WebDriver driver;

	@Test(priority=1)
	void display()
	{
		System.out.println("opening app");
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("nandhini");
	}
	@Test(priority=1)
	void start()
	{
		System.out.println("login to app");
		//driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();;
	}
	
	@Test(priority=-2)
	void close()
	{
		System.out.println("closing app");
		Assert.assertTrue(true);
		
		//driver.close();
		
	}
	
}
