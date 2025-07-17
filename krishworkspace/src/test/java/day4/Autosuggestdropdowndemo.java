package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestdropdowndemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("Selenium");
		List <WebElement>  links = driver.findElements(By.xpath("//div[@class='erkvQe']//ul[@role='listbox']//li"));
		for(WebElement ll : links)
		{
			if(ll.getText().equals("selenium java"))
			{
				ll.click();
					}
			//System.out.println(aa);
		}
	}

}
