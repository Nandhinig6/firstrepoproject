package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="dp")
	void login(String email,String password)
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if (status==true)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		}
	}
	
	@AfterClass
	void teardown()
	{
	driver.close();	
	}

	@DataProvider(name="dp")
	Object[][] data()
	{
		Object data[][]= {
				{"nandhu+1@gmail.com","Nandhu@123",
			     "nandhu+2@gmail.com","Nandhu@123"
				
		}
		
	};
		return data;
	}
	}
