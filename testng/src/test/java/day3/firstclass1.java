package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(day3.Listener.class)
public class firstclass1 {


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
		Assert.assertTrue(false);
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("nandhini");
	}
	@Test
	void setup()
	{
		System.out.println("start the application");
	}
	@Test(dependsOnMethods="display")
	void displaywindow()
	{
		System.out.println("display progess bar");
	}
	
	@BeforeTest
	void start()
	{
		System.out.println("Opening the app");
		/*driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();*/
	}
	
	@AfterTest
	void close()
	{
		System.out.println("closing the app");
		//driver.close();
		
	}
}


