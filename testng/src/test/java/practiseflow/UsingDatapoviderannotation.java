package practiseflow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDatapoviderannotation {
	
	WebDriver driver;
	@BeforeClass
	void start()
	{
	driver=new ChromeDriver();
	
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	@Test(dataProvider="dp", priority=0)
	void action(String fname, String lname,String email,String telephone, String pwd, String cpwd)
	{
	driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(fname);
	driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lname);
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(telephone);
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(cpwd);
	
	driver.findElement(By.xpath("//input[@name='agree']")).click();
	
	driver.findElement(By.xpath("//input[@value='Continue']")).click();
	
	String acttext = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
	if(acttext.equals("Your Account Has Been Created!"))
	{
		System.out.println("both are equal");
	}
	
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")).click();
		
	}
	
	
	@AfterClass
	void close()
	{
		driver.close();
	}
	

  @DataProvider(name="dp")
  Object data()
  {
	  Object data[][]= {
			  {"Nandhu", "gaja", "nandhusuriya+11@gmail.com", "987654", "Nandhu@123", "Nandhu@123"  },
			  {"Nandhu", "suriya", "nandhugaja+130@gmail.com", "76543","Nandhu@123", "Nandhu@123"  }
	  };
	  return data;
  }

}
