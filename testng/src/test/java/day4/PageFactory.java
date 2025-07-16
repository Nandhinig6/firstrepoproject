package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory {
	
	WebDriver driver;
	
	PageFactory(WebDriver driver)
	{
		this.driver=driver;
		
		//PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	

	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login;
	
	public void setuser(String user)
	{
		username.sendKeys(user);
	}
	
	
	
	
	

}
