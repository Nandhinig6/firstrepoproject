package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement sa = driver.findElement(By.xpath("//select[@id='colors']")); 
		Select s=new Select(sa);
		s.selectByValue("red");
		s.selectByValue("yellow");
		
		
		
 /* List<WebElement> dp= driver.findElements(By.xpath("//select[@id='country']//option"));
  System.out.println(dp.size());
  
  for(WebElement dps : dp)
  {
	  if( dps.getText().equals("India"))
			  {
	  dps.click();
  }*/

  
	}

}
