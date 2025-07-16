package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void test()
	{
		Loginpage lp=new Loginpage(driver);
		lp.setuname("Admin");
		lp.setpass("admin123");
		lp.onclic();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterClass
	void close()
	{
		driver.close();
	}

}
