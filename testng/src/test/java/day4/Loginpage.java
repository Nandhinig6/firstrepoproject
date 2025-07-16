package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	//constructover driver)
	Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}

	//elements 
	By username=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By click= By.xpath("//button[normalize-space()='Login']");
	
	//methods 
	public void setuname(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	public void setpass(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void onclic()
	{
		driver.findElement(click).click();	
	}
	

}
