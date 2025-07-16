package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ThirdTest {
  
	
	WebDriver driver;

	@AfterMethod
	void dd()
	{
		System.out.println("after method....");
	}
	@BeforeMethod
	void mm()
	{
		System.out.println("method/...");
	}
	@Test
	void display()
	{
		System.out.println("LOcate the application");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("nandhini");
	}
	@BeforeTest
	void start()
	{
		System.out.println("Opening the app");
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	void close()
	{
		System.out.println("closing the app");
		driver.close();
		
	}
}
